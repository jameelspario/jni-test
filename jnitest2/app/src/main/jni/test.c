#include <jni.h>
#include <stdio.h>      // C Standard IO Header

jstring
Java_com_example_jnitest2_Test_getMsgFromJni(JNIEnv *env, jobject instance) {
// Put your code here
//    return (*env)->NewStringUTF(env, "Hello From JNI");
    return (*env)->NewStringUTF(env, "Hello from JNI !  Compiled with ABI ");

}