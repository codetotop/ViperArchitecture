package com.codetotop.viperarchitecture.login;

public interface LoginContracts {
    interface View{
        //output from presenter.
       void showErrorMessage();
    }

    interface Presenter{
        //input from View
        void onClickBtnLogin(String userName,String passWord);
        void onClickTvForgotPassWord();
        //input from Interactor.
        void loginSuccess();
        void loginFailure();
    }

    interface Interactor{
        //input from Presenter
        void handleLogin(String userName,String passWord);

    }

    interface Router{
        //input from Presenter
        void openHomeScreen();
        void openForgotScreen();
    }
}
