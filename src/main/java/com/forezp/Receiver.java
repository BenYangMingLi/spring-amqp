package com.forezp;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.print("Received <" + message + ">");
        System.out.print(">>>>>>>>>>>>>>");
        latch.countDown();
    }


    public CountDownLatch getLatch() {
        return latch;
    }
}
