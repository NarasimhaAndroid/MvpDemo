package com.androiddev.mvpdemo.login;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
