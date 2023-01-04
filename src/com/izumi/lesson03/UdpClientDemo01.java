package com.izumi.lesson03;

import java.io.IOException;
import java.net.*;

// UDP消息发送，不需要连接服务器
public class UdpClientDemo01 {
    public static void main(String[] args) throws IOException {
        // 1. 简历一个Socket
        DatagramSocket socket = new DatagramSocket();

        // 2. 建个包
        String msg = "你好啊，服务器！";
        // 发送给谁
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;

        /**
         * 参数：数据，数据的长度起始，要发送给谁
         */
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

        // 3. 发送包
        socket.send(packet);

        // 4. 关闭流
        socket.close();
    }
}
