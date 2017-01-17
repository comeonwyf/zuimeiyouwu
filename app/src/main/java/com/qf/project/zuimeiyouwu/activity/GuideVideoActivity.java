package com.qf.project.zuimeiyouwu.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.chenhao.mr_chenlibrary.util.SharedUtil;
import com.qf.project.zuimeiyouwu.R;

import java.io.IOException;

/**
 * Created by Administrator on 2017/1/17.
 */
public class GuideVideoActivity extends BaseActivity {

    private SharedPreferences sp;
    private SurfaceView sv;
    private MediaPlayer mp;

    @Override
    protected int getContentId() {
        return R.layout.guidevedio_layout;
    }

    @Override
    protected void init() {
        sp = getSharedPreferences("my_file", Context.MODE_PRIVATE);
        if (sp.getBoolean("flag",false)){
            Intent intent  = new Intent(this,Welcome.class);
            startActivity(intent);
            finish();
        }else{
            initView();
            setData();
            setListener();
        }
    }

    private void setListener() {
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent intent = new Intent(GuideVideoActivity.this,MainActivity.class);
                startActivity(intent);
                SharedPreferences.Editor edit = sp.edit();
                edit.putBoolean("flag",true);
                edit.commit();
                finish();
            }
        });
    }

    private void setData() {
        //获取surfaceholder对象
        SurfaceHolder holder = sv.getHolder();
        holder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                //播放前重置一下
                mp.reset();
                //获取播放器地址
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.guide);
                //给播放器设置holder，确认在哪个地方播放
                mp.setDisplay(holder);
                try {
                    //设置播放器的地址
                    mp.setDataSource(GuideVideoActivity.this,uri);
                    //准备播放视屏
                    mp.prepareAsync();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });
    }

    private void initView() {
        sv = findViewByIds(R.id.sv_vedio);
        mp = new MediaPlayer();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(mp !=null){
            if (mp.isPlaying()){
                mp.stop();
            }
            mp.release();
        }
    }
}
