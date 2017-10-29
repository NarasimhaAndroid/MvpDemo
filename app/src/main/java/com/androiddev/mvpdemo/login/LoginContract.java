package com.androiddev.mvpdemo.login;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public interface LoginContract {
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
