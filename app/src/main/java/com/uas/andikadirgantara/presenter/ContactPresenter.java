package com.uas.andikadirgantara.presenter;

import com.uas.andikadirgantara.view.ContactView;


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
