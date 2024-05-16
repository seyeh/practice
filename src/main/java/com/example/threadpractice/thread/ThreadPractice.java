package com.example.threadpractice.thread;

public class ThreadPractice extends Thread
{
    public void run(){
        System.out.println("Thread is running: " + Thread.currentThread().getId());
    }

}
