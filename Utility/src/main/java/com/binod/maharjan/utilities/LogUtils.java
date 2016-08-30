package com.binod.maharjan.utilities;

import android.util.Log;


/**
 * Created by DELL on 7/28/2015.
 */
public class LogUtils {

    private static String TAG = "Ballard";
    private static boolean show = true;

    public static void i(String TAG, String msg) {
        if (BuildConfig.DEBUG)
            Log.i(TAG, msg);
    }

    public static void d(String TAG, String msg) {
        if (BuildConfig.DEBUG)
            Log.d(TAG, msg);
    }

    public static void wtf(String TAG, String msg) {
        if (BuildConfig.DEBUG)
            Log.wtf(TAG, msg);
    }

    public static void e(String TAG, String msg) {
        if (BuildConfig.DEBUG)
            Log.e(TAG, msg);
    }

    public static void v(String TAG, String msg) {
        if (BuildConfig.DEBUG)
            Log.v(TAG, msg);
    }


}
