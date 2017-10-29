package com.androiddev.mvpdemo.main;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public interface MainPresenter {
    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
