package com.izumi.lesson01;

import java.net.InetSocketAddress;

// Ì×½Ó×Ö
public class TestInetSocketsAddress {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8080);
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress("localhost", 8080);

        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress2);

        System.out.println(inetSocketAddress2.getAddress());
        System.out.println(inetSocketAddress2.getHostName());

    }
}
