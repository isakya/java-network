package com.izumi.lesson02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. ����һ��Socket����
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        // 2. ����һ�������
        OutputStream os = socket.getOutputStream();
        // 3. �ļ���
        FileInputStream fis = new FileInputStream(new File("./izumi.jpg"));

        // 4. д���ļ�
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read()) != -1) {
            os.write(buffer, 0, len);
        }

        // ֪ͨ�����������Ѿ���������
        socket.shutdownOutput(); // ���Ѿ���������

        // ȷ��������������ϣ����ܶϿ�����
        InputStream inputStream = socket.getInputStream();
        //String byte[]
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2 = inputStream.read(buffer2)) != -1) {
            baos.write(buffer2, 0, len2);
        }

        System.out.println(baos.toString());

        // 5. �ر���Դ
        baos.close();
        inputStream.close();
        fis.close();
        os.close();
        socket.close();
    }
}
