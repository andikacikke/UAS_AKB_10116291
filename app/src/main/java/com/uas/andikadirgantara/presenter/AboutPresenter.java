package com.uas.andikadirgantara.presenter;

import com.uas.andikadirgantara.view.AboutView;

/** Created on 15/08/2019 by AndikaDirgantara,10116291.IF7
 */


public class AboutPresenter {

    private AboutView view;

    public AboutPresenter(AboutView view) {
        this.view = view;
    }

    public void selectionView(int tab) {
        if (tab == 0) {
            view.showApp();
        } else {
            view.showCreator();
        }
    }
}
