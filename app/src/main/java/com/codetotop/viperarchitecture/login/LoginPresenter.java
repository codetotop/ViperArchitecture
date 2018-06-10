package com.codetotop.viperarchitecture.login;

import android.app.Activity;

public class LoginPresenter implements LoginContracts.Presenter {

    LoginContracts.View view;
    LoginContracts.Router router;
    LoginContracts.Interactor interactor;

    public LoginPresenter(LoginContracts.View view) {
        router = new LoginRouter((Activity) view);
        interactor = new LoginInteractor(this);
        this.view = view;
    }

    @Override
    public void onClickBtnLogin(String userName, String passWord) {
        interactor.handleLogin(userName, passWord);
    }

    @Override
    public void onClickTvForgotPassWord() {
        router.openForgotScreen();
    }

    @Override
    public void loginSuccess() {
        router.openHomeScreen();
    }

    @Override
    public void loginFailure() {
        view.showErrorMessage();
    }
}
