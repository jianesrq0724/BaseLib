package com.ruiqin.baselib.home.presenter;

import com.ruiqin.baselib.home.interfaces.MainViewI;
import com.ruiqin.baselibrary.base.BasePresenter;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/9
 */

public class MainPresenter extends BasePresenter<MainViewI> {

    public void testP(int a) {
        mViewRef.get().testView(a);
    }

}
