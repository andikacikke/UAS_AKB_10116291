package com.uas.andikadirgantara.view;

import com.uas.andikadirgantara.data.model.Friends;



public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
