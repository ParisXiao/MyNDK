package com.zyzk.myndk;

/**
 * Created by Admin on 2018/1/10.
 */

public class MyNative {
    static {
        System.loadLibrary("myjni");
    }
    public static native String myjni();
}
