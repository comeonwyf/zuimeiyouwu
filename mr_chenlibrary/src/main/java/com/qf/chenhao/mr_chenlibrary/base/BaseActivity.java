package com.qf.chenhao.mr_chenlibrary.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.qf.chenhao.mr_chenlibrary.R;
import com.qf.chenhao.mr_chenlibrary.util.ScreenUtil;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/12/26.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected  FragmentManager fragmentManager;
    private Fragment showFragment;//显示当前的fragment

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentId());
        ButterKnife.bind(this);

        fragmentManager = getSupportFragmentManager();
        //开启沉浸试状态栏
        if (isOpenStatus()){
            //沉浸式状态栏（透明状态栏） -- android4.4以后提供
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){//5.0以上
                window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);//让子控件填充整个屏幕
                window.setStatusBarColor(Color.TRANSPARENT);
            }else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
                //4.0以上
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            }

            View view = findViewByIds(R.id.actionbar);
            if (view != null){
                int height = ScreenUtil.getStatusHeight(this);
                if (height!= -1){
                    view.setPadding(0,height,0,0);
                }
            }
        }

        init();
        loadDatas();
    }

    protected void loadDatas() {
    }

    /**
     *fragment的优化（隐藏与显示）
     * @param frameLayoutId
     * @param fragment
     */
    protected void showFragment(int frameLayoutId, Fragment fragment){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //检测 当前是否有fragment，有则隐藏
        if (showFragment != null){
            fragmentTransaction.hide(showFragment);
        }
        //判断需要显示的fragment是否原来出来过，如果有，则显示
        Fragment fragmentByTag = fragmentManager.findFragmentByTag(fragment.getClass().getName());
        if (fragmentByTag != null){
            fragmentTransaction.show(fragmentByTag);
        }else{
            //如果没有则add
            fragmentByTag = fragment;
            fragmentTransaction.add(frameLayoutId,fragmentByTag,fragment.getClass().getName());
        }
        showFragment = fragmentByTag;
        fragmentTransaction.commit();
    }

    protected void init() {
    }

    protected abstract int getContentId();

    protected boolean isOpenStatus(){
        return true;
    }

    /**
     * 避免强转的控件查找方法
     * @param id
     * @param <T>
     * @return
     */
    protected <T> T findViewByIds(int id){
        return (T)findViewById(id);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
