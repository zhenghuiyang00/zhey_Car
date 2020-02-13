package com.bwei.zhey_car.uitl;


import okhttp3.logging.HttpLoggingInterceptor;

public class NetUtil {

    private static final String BASE_URL="http://mobile.bwstudent.com/";

    public static NetUtil getInstance() {
        return SingleHolder.NET_UTIL;
    }

    private static final class SingleHolder{
        private static final NetUtil NET_UTIL=new NetUtil();
    }

    private NetUtil(){
        //日志拦截器
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


    }



}
