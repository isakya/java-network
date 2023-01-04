package com.izumi.lesson04;

import java.net.MalformedURLException;
import java.net.URL;

// URL������Ϣ
public class URLDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/helloworld/index.jsp?username=izumi&password=123");
        System.out.println(url.getProtocol()); // Э����
        System.out.println(url.getHost()); // ����IP
        System.out.println(url.getPort()); // �˿�
        System.out.println(url.getPath()); // �ļ�
        System.out.println(url.getFile()); // �ļ�ȫ·��
        System.out.println(url.getQuery()); // ����
    }
}
