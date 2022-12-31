package com.izumi.lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

// ����IP
public class TestInetAddress {
    public static void main(String[] args) {
        try {
            // ��ѯ������ַ
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);

            InetAddress inetAddress11 = InetAddress.getByName("localhost");
            System.out.println(inetAddress11);

            InetAddress inetAddress111 = InetAddress.getLocalHost();
            System.out.println(inetAddress111);


            // ��ѯ��վIP��ַ
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);

            // ���÷���
            // System.out.println(inetAddress2.getAddress());
            System.out.println(inetAddress2.getCanonicalHostName()); // ��ù淶������
            System.out.println(inetAddress2.getHostAddress()); // ip
            System.out.println(inetAddress2.getHostName()); // �������������Լ����Ե�����

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
