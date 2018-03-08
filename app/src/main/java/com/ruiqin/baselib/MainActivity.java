package com.ruiqin.baselib;

import com.ruiqin.baselibrary.base.BaseActivity;
import com.ruiqin.baselibrary.base.BasePresenter;

public class MainActivity extends BaseActivity {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getFragmentContentId() {
        return 0;
    }
}
