package com.izumi.lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 测试IP
public class TestInetAddress {
    public static void main(String[] args) {
        try {
            // 查询本机地址
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);

            InetAddress inetAddress11 = InetAddress.getByName("localhost");
            System.out.println(inetAddress11);

            InetAddress inetAddress111 = InetAddress.getLocalHost();
            System.out.println(inetAddress111);


            // 查询网站IP地址
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);

            // 常用方法
            // System.out.println(inetAddress2.getAddress());
            System.out.println(inetAddress2.getCanonicalHostName()); // 获得规范的名字
            System.out.println(inetAddress2.getHostAddress()); // ip
            System.out.println(inetAddress2.getHostName()); // 域名，或者是自己电脑的名字

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
