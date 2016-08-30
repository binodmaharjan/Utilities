package com.binod.maharjan.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.binod.maharjan.utilities.LogUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      LogUtils.i("Hello world", "tag");
    }
}
