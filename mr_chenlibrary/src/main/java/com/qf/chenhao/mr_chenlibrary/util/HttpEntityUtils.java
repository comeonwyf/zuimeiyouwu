package com.qf.chenhao.mr_chenlibrary.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by huangxin on 2016/12/1.
 */

public class HttpEntityUtils {
//    网络请求字符串
    public static String HttpConnectionToString(String path){
        BufferedReader reader = null;
        InputStream inputStream = null;
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(path);
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                if (connection.getResponseCode()==200){
                   inputStream = connection.getInputStream();
                   reader = new BufferedReader(new InputStreamReader(inputStream));
                   String string = null;
                    while((string = reader.readLine())!=null){
                        buffer.append(string);
                    }
                    Log.i("TAG","buffer----"+buffer.toString());
                    return buffer.toString();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

//    下载图片
    public static Bitmap HttpConntionToImage(String path){
        Bitmap bitmap;
        ByteArrayOutputStream outputStream = null;
        InputStream inputStream =null;
        try {
            URL url = new URL(path);
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                if (connection.getResponseCode()==200){
                    inputStream = connection.getInputStream();
                    outputStream = new ByteArrayOutputStream();
                    byte[] by = new byte[1024];
                    int num = 0;
                    while ((num=inputStream.read(by))!=-1){
                        outputStream.write(by,0,num);
                        outputStream.flush();
                    }
                    byte[] bt =  outputStream.toByteArray();
                    bitmap = BitmapFactory.decodeByteArray(bt,0,bt.length);
                    return bitmap;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
