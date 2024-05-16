package com.example.threadpractice.model;

public class Person
{
    Integer netWorth;
    String name;
    public Person(String name, Integer netWorth)
    {
        this.name = name;
        this.netWorth = netWorth;
    }
    public Integer getNetWorth(){
        return this.netWorth;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.getName() + " is worth: " + this.getNetWorth();
    }
}
