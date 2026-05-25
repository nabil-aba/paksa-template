cmake_minimum_required(VERSION 3.22.1)
project("native-lib")

add_library(
        ${CMAKE_PROJECT_NAME}
        SHARED
        native-lib.cpp)

# Menghubungkan library log bawaan Android agar C++ bisa nge-print Logcat
target_link_libraries(
        ${CMAKE_PROJECT_NAME}
        android
        log)