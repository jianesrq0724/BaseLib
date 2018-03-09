package com.ruiqin.baselib.home.view;

import android.widget.TextView;

import com.ruiqin.baselib.R;
import com.ruiqin.baselib.home.interfaces.MainViewI;
import com.ruiqin.baselib.home.presenter.MainPresenter;
import com.ruiqin.baselibrary.base.BaseActivity;
import com.ruiqin.baselibrary.util.ToastUtils;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainViewI, MainPresenter> implements MainViewI {
    @BindView(R.id.main_tv)
    TextView mainTv;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mainTv.setOnClickListener(view -> {
            mPresenter.testP(10);
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }


    @Override
    protected int getFragmentContentId() {
        return 0;
    }

    @Override
    public void testView(int a) {
        ToastUtils.showShort(String.valueOf(a));
    }
}
