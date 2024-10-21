package com.android.jnitest3;

public class JniLibrary {

    static {
        System.loadLibrary("jnitest3");
    }

    /**
     * A native method that is implemented by the 'jnitest3' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native int add(int x, int y);
    public native int sub(int x, int y);
    public native int multiply(int x, int y);
    public native int divide(int x, int y);

}
