package com.uas.andikadirgantara.view;

import com.uas.andikadirgantara.data.model.User;
/** Created on 13/08/2019 by AndikaDirgantara,10116291.IF7
 */


public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
