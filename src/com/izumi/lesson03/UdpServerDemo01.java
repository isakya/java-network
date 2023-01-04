package com.izumi.lesson03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

// UDP�������ˣ�����Ҫ�ȴ��ͻ��˵�����
public class UdpServerDemo01 {
    public static void main(String[] args) throws IOException {
        // ���Ŷ˿�
        DatagramSocket socket = new DatagramSocket(9090);

        // �������ݰ�
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);// ����

        socket.receive(packet); // ��������

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(), 0, packet.getLength()));

        // �ر�����
        socket.close();
    }
}
