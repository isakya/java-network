package com.izumi.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UdpReceiveDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(6666);

        while (true) {
            // 准备接收包裹
            byte[] container = new byte[1024];

            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet); // 阻塞式接收包裹

            // 断开连接 bye
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, packet.getLength());
            System.out.println(receiveData);
            if(receiveData.equals("bye")) {
                break;
            }
        }

        socket.close();
    }
}
