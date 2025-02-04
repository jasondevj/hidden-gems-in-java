package com.j.hidden;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class SimpleClass {

    public static void numberSum() {
        System.out.println(0.1 + 0.2);
    }

    public static void integer() {
        Integer a = 100;
        Integer b = 100;
        System.out.println("is equal: " + (a == b));
    }

    public static void nullEqual(Object obj) {
        if (obj == null) {
            System.out.println("not null");
        }
    }

    public static void main(String[] args) {
//        numberSum();
//        integer();
//        nullEqual(new Object());
    }
}
