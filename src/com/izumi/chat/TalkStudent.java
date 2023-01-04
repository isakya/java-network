package com.izumi.chat;

public class TalkStudent {
    public static void main(String[] args) {
        // 开启两个线程
        new Thread(new TalkSend(7777, "localhost", 9999)).start();
        new Thread(new TalkReceive(6565, "老师")).start();
    }
}
