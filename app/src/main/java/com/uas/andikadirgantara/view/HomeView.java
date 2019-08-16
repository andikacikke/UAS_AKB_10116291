package com.uas.andikadirgantara.view;

import com.uas.andikadirgantara.data.model.User;



public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
