package org.example.concurrentHashMap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapValues {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> accounts = new ConcurrentHashMap<Integer, Integer>();
//        HashMap<Integer, Integer> accounts = new HashMap<Integer, Integer>();

        accounts.put(101,10400);

        Thread t1 = new Thread(()->{
            accounts.compute(101, (key, balance) -> balance + 5000);
        });
        Thread t2 = new Thread(()->{
            accounts.compute(101, (key, balance) -> balance + 5000);
        });

        t1.start();
        t2.start();
        

    }
}
