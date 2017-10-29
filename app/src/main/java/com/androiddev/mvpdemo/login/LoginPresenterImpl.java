package com.androiddev.mvpdemo.login;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public class LoginPresenterImpl implements LoginPresenter,LoginContract.OnLoginFinishedListener {

    private LoginView loginView;
    private LoginContract loginContract;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginContract = new LoginContractImpl();

    }

    @Override
    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }
        loginContract.login(username, password, this);

    }



    @Override
    public void onDestroy() {
        loginView = null;

    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
