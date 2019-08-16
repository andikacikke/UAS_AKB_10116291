package com.uas.andikadirgantara.view;

import com.uas.andikadirgantara.data.model.Friends;

/** Created on 13/08/2019 by AndikaDirgantara,10116291.IF7
 */

public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
