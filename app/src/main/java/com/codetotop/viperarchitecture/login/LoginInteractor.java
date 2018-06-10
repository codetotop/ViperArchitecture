package com.codetotop.viperarchitecture.login;

import android.text.TextUtils;

import com.codetotop.viperarchitecture.R;

public class LoginInteractor implements LoginContracts.Interactor {
    LoginContracts.Presenter presenter;

    public LoginInteractor(LoginContracts.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void handleLogin(String userName, String passWord) {
        if(userName.toLowerCase().equals("NBDUNG")||passWord.toLowerCase().equals("1996")){
            presenter.loginSuccess();
        }else
            presenter.loginFailure();
    }
}
