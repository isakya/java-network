package com.izumi.lesson02;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// �����
public class TcpServerDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. ��������
        ServerSocket serverSocket = new ServerSocket(9000);
        // 2. �����ͻ��˵�����
        Socket socket = serverSocket.accept();// ����ʽ��������һֱ�ȴ��ͻ�������
        // 3. ��ȡ������
        InputStream is = socket.getInputStream();
        // 4. �ļ����
        FileOutputStream fos = new FileOutputStream(new File("receive.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        // ֪ͨ�ͻ����ҽ��������
        OutputStream os = socket.getOutputStream();
        os.write("�ҽ��������".getBytes());

        // �ر���Դ
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
