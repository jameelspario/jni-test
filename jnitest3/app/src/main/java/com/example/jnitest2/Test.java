package com.example.jnitest2;

public class Test {

    static {
        System.loadLibrary("test");
    }

    public native String getMsgFromJni();



}
