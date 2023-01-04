package com.izumi.lesson04;

import sun.nio.cs.StandardCharsets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// URL�����ļ�
public class URLDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. ���ص�ַ
        URL url = new URL("https://t7.baidu.com/it/u=1595072465,3644073269&fm=193&f=GIF");

        // 2. ���ӵ������ԴHTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream(new File("./img.jfif"));
        byte[] buffer = new byte[1024];

        int len;
        while ((len = inputStream.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fos.close();
        inputStream.close();
        urlConnection.disconnect(); // �Ͽ�����
    }
}
