package com.qf.project.zuimeiyouwu.fragment;

import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.qf.chenhao.mr_chenlibrary.base.BaseFragment;
import com.qf.project.zuimeiyouwu.R;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/1/17.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener {

    @Bind(R.id.daily)
    public TextView daily;
    @Bind(R.id.attention)
    public TextView attention;
    @Bind(R.id.wish)
    public TextView wish;
    @Bind(R.id.message)
    public TextView message;
    @Bind(R.id.feedback)
    public TextView feedback;
    @Bind(R.id.zuimei)
    public TextView zuimei;
    @Bind(R.id.setting)
    public ImageView setting;

    @Override
    protected int getContentId() {
        return R.layout.fragment_mine_layout;
    }

    @Override
    protected void init(View view) {
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(),"fonts/FZLanTingHeiS_Regular.otf");
        //设置字体风格
        daily.setTypeface(typeface);
        attention.setTypeface(typeface);
        wish.setTypeface(typeface);
        message.setTypeface(typeface);
        feedback.setTypeface(typeface);
        zuimei.setTypeface(typeface);

        //点击事件
        setting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
