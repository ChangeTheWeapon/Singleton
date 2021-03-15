package com.company;

public class Main {

    public static void main(String[] args){
        LazyWorker lazyWorker = LazyWorker.getInstance(1,"John Walker","Apple","Manager","full-time",10000.00);
        LazyWorker anotherWorker = LazyWorker.getInstance(2,"Madison Lee","SMP","accountant","part-time",4000.00);
        if(lazyWorker.name == anotherWorker.name){
            System.out.println("Succes");
            System.out.println("Lazy");
        }
        else{
            System.out.println("Error");
        }
        System.out.println(lazyWorker);
        System.out.println(anotherWorker);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        SynchronizedWorker synchronizedWorker = SynchronizedWorker.getInstance(1,"John Walker","Apple","Manager","full-time",10000.00);
        SynchronizedWorker twoWorker = SynchronizedWorker.getInstance(2,"Madison Lee","SMP","accountant","part-time",4000.00);
        if(synchronizedWorker.name == twoWorker.name){
            System.out.println("Succes");
            System.out.println("Syncronized");
        }
        else{
            System.out.println("Error");
        }
        System.out.println(synchronizedWorker);
        System.out.println(twoWorker);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");



    }
}

