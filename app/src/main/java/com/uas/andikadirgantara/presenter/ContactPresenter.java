package com.uas.andikadirgantara.presenter;

import com.uas.andikadirgantara.view.ContactView;

/** Created on 13/08/2019 by AndikaDirgantara,10116291.IF7
 */
public class ContactPresenter {

    private ContactView view;

    public ContactPresenter(ContactView view) {
        this.view = view;
    }

    public void makeCall() {
        view.actionCall();
    }

    public void sendEmail() {
        view.actionEmail();
    }

    public void openInstagram() {
        view.actionInstagram();
    }

    public void openTwitter() {
        view.actionTwitter();
    }
}
