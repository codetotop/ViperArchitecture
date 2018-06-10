package com.codetotop.viperarchitecture.login;

import android.app.Activity;
import android.content.Intent;

import com.codetotop.viperarchitecture.fogot.ForgotActivity;
import com.codetotop.viperarchitecture.home.HomeActivity;

public class LoginRouter implements LoginContracts.Router {

    Activity activity;

    public LoginRouter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void openHomeScreen() {
        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    public void openForgotScreen() {
        Intent intent = new Intent(activity, ForgotActivity.class);
        activity.startActivity(intent);
    }
}
