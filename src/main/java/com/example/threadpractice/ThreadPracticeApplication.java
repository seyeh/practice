package com.example.threadpractice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.threadpractice.model.Friend;

@SpringBootApplication
public class ThreadPracticeApplication
{
    public static void main(String[] args) throws InterruptedException
    {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");
        new Thread(new Runnable(){
            public void run(){
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run(){
                gaston.bow(alphonse);
            }
        }).start();
    }

}
