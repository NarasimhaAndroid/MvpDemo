package com.androiddev.mvpdemo.main;

import java.util.List;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
