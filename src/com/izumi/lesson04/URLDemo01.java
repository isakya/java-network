package com.izumi.lesson04;

import java.net.MalformedURLException;
import java.net.URL;

// URL基础信息
public class URLDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/helloworld/index.jsp?username=izumi&password=123");
        System.out.println(url.getProtocol()); // 协议名
        System.out.println(url.getHost()); // 主机IP
        System.out.println(url.getPort()); // 端口
        System.out.println(url.getPath()); // 文件
        System.out.println(url.getFile()); // 文件全路径
        System.out.println(url.getQuery()); // 参数
    }
}
