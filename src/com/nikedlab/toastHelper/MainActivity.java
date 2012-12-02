package com.nikedlab.toastHelper;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ToastHelper mToastHelper = new ToastHelper(MainActivity.this);

        mToastHelper.showToast("Hello", ToastHelper.LENGTH_SHORT);

        mToastHelper.setGravity(ToastHelper.GRAVITY_TOP_CENTER);
        mToastHelper.setXOffset(22);
        mToastHelper.setYOffset(34);
        mToastHelper.showCustomToast("Hello", ToastHelper.LENGTH_SHORT, ToastHelper.TYPE_ERROR);


    }
}
