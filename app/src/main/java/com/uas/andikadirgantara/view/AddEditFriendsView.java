package com.uas.andikadirgantara.view;

import android.widget.EditText;

import com.uas.andikadirgantara.data.model.Friends;


/** Created on 14/08/2019 by AndikaDirgantara,10116291.IF7
 */
public interface AddEditFriendsView {
    void showData();
    void onFriendAdded();
    void onFriendUpdated(Friends friend);
    void showError(EditText et);
    void showFailed(String msg);
}
