package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        ////okhttp在enqueue（）方法的内部已经帮我们开好子线程了 ，然后会在子线程里进行HTTP请求
        client.newCall(request).enqueue(callback);
    }

}
