package com.izumi.lesson02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

// �ͻ���
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            // 1. Ҫ֪���������ĵ�ַ���˿ں�
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            // 2. ����һ��socket����
            socket = new Socket(serverIP, port);
            // 3. ������ϢIO��
            os = socket.getOutputStream();
            os.write("��ã�hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
