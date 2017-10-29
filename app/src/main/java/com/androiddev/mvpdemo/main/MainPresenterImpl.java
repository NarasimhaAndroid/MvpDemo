package com.androiddev.mvpdemo.main;

import java.util.List;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public class MainPresenterImpl implements MainPresenter,FindItemContract.OnFinishedListener {

    private MainView mainView;
    private FindItemContract findItemContract;


    public MainPresenterImpl(MainView mainView, FindItemContract findItemContract) {
        this.mainView = mainView;
        this.findItemContract = findItemContract;
    }


    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        findItemContract.findItems(this);

    }

    @Override
    public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }

    }

    @Override
    public void onDestroy() {

        mainView = null;

    }

    @Override
    public void onFinished(List<String> items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }

    }

    public MainView getMainView() {
        return mainView;
    }
}
