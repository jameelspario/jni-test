## NDK

#### jnitest
- basic NDK example
- uses CMakelists.txt
- uses ```System.loadLibrary()``` to load library

    ![jni test](images/jnitest.PNG)

#### jnitest2
- basic NDK example
- uses Android.mk and Application.mk
- uses ```System.loadLibrary()```

    ![jni test example](images/jnitest1.PNG)

#### ndk-build-test
- uses Android.mk and Application.mk
- get ABI using c code


#### jnitest3
- uses CMakelists.txt
- add, sub, mult, divide method in native code


************************************
Native primitive data types

|Java primitive type|Native primitive type|
|-------------------|---------------------|
|void|void|
|byte|jbyte|
|int|jint|
|float|jfloat|
|double|jdouble|
|char|jchar|
|long|jlong|
|short|jshort|
|boolean|jboolean|
|||


- method name in jni library is defined as PackageName_ActivityName_MethodName or PackageName_ClassName_MethodName 

- MethodName will be called from java/kotlin