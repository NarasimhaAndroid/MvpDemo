package com.androiddev.mvpdemo.main;

import java.util.List;

/**
 * Created by narasinhareddy on 29/10/17.
 */

public interface FindItemContract {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
