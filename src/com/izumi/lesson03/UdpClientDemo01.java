package com.izumi.lesson03;

import java.io.IOException;
import java.net.*;

// UDP��Ϣ���ͣ�����Ҫ���ӷ�����
public class UdpClientDemo01 {
    public static void main(String[] args) throws IOException {
        // 1. ����һ��Socket
        DatagramSocket socket = new DatagramSocket();

        // 2. ������
        String msg = "��ð�����������";
        // ���͸�˭
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;

        /**
         * ���������ݣ����ݵĳ�����ʼ��Ҫ���͸�˭
         */
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

        // 3. ���Ͱ�
        socket.send(packet);

        // 4. �ر���
        socket.close();
    }
}
