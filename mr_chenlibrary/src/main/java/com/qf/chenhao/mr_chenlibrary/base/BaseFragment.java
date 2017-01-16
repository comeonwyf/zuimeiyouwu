package com.qf.chenhao.mr_chenlibrary.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.chenhao.mr_chenlibrary.R;
import com.qf.chenhao.mr_chenlibrary.util.ScreenUtil;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/12/26.
 */
public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getContentId(), container, false);
        ButterKnife.bind(this,view);

        Activity activity = getActivity();
        if (activity instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activity;
            if (baseActivity.isOpenStatus()) {
                View actionbar = view.findViewById(R.id.actionbar);
                if (actionbar != null) {
                    int statusHeight = ScreenUtil.getStatusHeight(activity);
                    if (statusHeight != -1) {
                        actionbar.setPadding(0, statusHeight, 0, 0);
                    }
                }
            }
        }

        return view;
    }

    protected abstract int getContentId();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        init(view);
        loadDatas();
    }

    protected void loadDatas() {

    }

    protected void init(View view) {
    }

    protected <T> T findViewByIds(View view, int id) {
        return (T) view.findViewById(id);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null){
            getDatas(bundle);
        }
    }

    protected void getDatas(Bundle bundle){

    }
}
