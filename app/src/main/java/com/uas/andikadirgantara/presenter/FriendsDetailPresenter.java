package com.uas.andikadirgantara.presenter;

import android.content.Context;

import com.uas.andikadirgantara.data.model.Friends;
import com.uas.andikadirgantara.data.repo.FriendsRepository;
import com.uas.andikadirgantara.view.FriendsDetailView;



public class FriendsDetailPresenter {

    private FriendsDetailView view;
    private FriendsRepository repo;

    public FriendsDetailPresenter(Context context, FriendsDetailView view) {
        this.view = view;
        repo = new FriendsRepository(context);
    }

    public void getFriendsDetail(Friends fr) {
        view.showDetail(fr);
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

    public void removeFriend(Friends friend) {
        repo.deleteFriend(friend);
        view.onFriendDeleted();
    }
}
