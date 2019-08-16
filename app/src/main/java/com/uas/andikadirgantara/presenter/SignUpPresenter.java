package com.uas.andikadirgantara.presenter;

import android.content.Context;
import android.widget.EditText;

import com.uas.andikadirgantara.data.model.User;
import com.uas.andikadirgantara.data.repo.UserRepository;
import com.uas.andikadirgantara.view.SignUpView;

/** Created on 13/08/2019 by AndikaDirgantara,10116291.IF7
 */

public class SignUpPresenter {

    private SignUpView view;
    private UserRepository repo;

    public SignUpPresenter(Context context, SignUpView view) {
        this.view = view;
        repo = new UserRepository(context);
    }

    public void signUp(User user) {
        try {
            repo.insertUser(user);
            view.signUpSuccess();
        } catch (Exception ex) {
            view.signUpFailed();
        }
    }

    public void setError(EditText editText) {
        editText.requestFocus();
        editText.setError("Please fill this box !");
    }

    public void setPassError(EditText editText) {
        editText.requestFocus();
        editText.setError("Password length minimal 8 character !");
    }
}
