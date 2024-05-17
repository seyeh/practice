package com.example.threadpractice;

import com.example.threadpractice.model.BankAccount;
import com.example.threadpractice.thread.ThreadIntegers;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.threadpractice.model.Friend;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

@SpringBootApplication
public class ThreadPracticeApplication
{
    public static void main(String[] args) throws InterruptedException
    {
        Integer[][] array= {
                {1, 5},
                {13, 3},
                {12, 10},
                {534, 85} };
        for(Integer[] arr :array)
        {
            Arrays.sort(arr, Collections.reverseOrder());
        }
        java.util.Arrays.sort(array, (a, b) ->
                Integer.compare(b[0], a[0]));
        for(Integer [] arr : array)
        {
            for(int num : arr)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
//        BankAccount b1 = new BankAccount(100);
//        Thread t1 = new Thread(() ->{
//            b1.deposit(400);
//            b1.withdraw(100);
//            System.out.println(b1.getAccountBalance());
//        });
//        Thread t2 = new Thread(() ->{
//            System.out.println(b1.getAccountBalance());
//            b1.withdraw(500);
//            b1.deposit(500);
//        });
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
    }

}
