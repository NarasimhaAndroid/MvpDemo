package com.androiddev.mvpdemo.login;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
