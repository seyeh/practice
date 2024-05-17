package com.example.threadpractice.thread;

import java.util.Arrays;
import java.util.List;

public class ThreadIntegers extends Thread
{
    private final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
    @Override
    public void run(){
        numbers.stream().map(e -> e * 10).forEach(System.out::println);
    }
}
