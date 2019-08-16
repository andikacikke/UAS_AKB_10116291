package com.uas.andikadirgantara.presenter;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.uas.andikadirgantara.preference.UserPreference;
import com.uas.andikadirgantara.view.MainView;

/** Created on 11/08/2019 by AndikaDirgantara,10116291.IF7
 */
public class MainPresenter {

    private MainView view;
    private UserPreference prefs;

    public MainPresenter(Context context, MainView view) {
        this.view = view;
        prefs = new UserPreference(context);
    }

    public void isLogin() {
        if (prefs.userLogin() == null) view.toLogin();
    }

    public void addView() {
        view.addView();
    }

    public void changeView(Fragment fragment) {
        view.showView(fragment);
    }
}
