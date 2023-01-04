package com.izumi.chat;

public class TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TalkSend(5555, "localhost", 6565)).start();
        new Thread(new TalkReceive(9999, "Ñ§Éú")).start();
    }
}
