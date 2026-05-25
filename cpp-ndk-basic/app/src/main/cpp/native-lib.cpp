#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_projectnabil_basic_cpp_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    
    std::string hello = "Hello from Native C++ Engine! 🚀";
    return env->NewStringUTF(hello.c_str());
}