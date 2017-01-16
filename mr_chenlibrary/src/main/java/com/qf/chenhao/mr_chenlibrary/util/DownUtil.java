package com.qf.chenhao.mr_chenlibrary.util;

import android.os.Handler;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2016/12/26.
 */
public class DownUtil {

    private static final String TAG = "print";
    private static Handler handler = new Handler();

    public static void down(final String url, final OnDownListener listener){
        new Thread(){
            @Override
            public void run() {
                final String jsonString = requestJson(url);
                //Log.i(TAG, "run: "+jsonString);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null){
                            listener.downSucc(jsonString);
                        }
                    }
                });
            }
        }.start();
    }

    private static String requestJson(String urlstr) {
        InputStream inputStream = null;
        ByteArrayOutputStream bos = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(urlstr).openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(3000) ;
            inputStream = connection.getInputStream();
            bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024*8];
            int len;
            while((len = inputStream.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }
            byte[] bytes = bos.toByteArray();
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null && bos!= null){
                    inputStream.close();
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public interface OnDownListener{
        void downSucc(String json);
    }
}
