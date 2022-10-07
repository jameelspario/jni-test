LOCAL_PATH:= $(call my-dir) # Get the local path of the project.
include $(CLEAR_VARS) # Clear all the variables with a prefix "LOCAL_"

LOCAL_SRC_FILES:=test.c # Indicate the source code.
LOCAL_MODULE:= test # The name of the binary.
include $(BUILD_SHARED_LIBRARY)