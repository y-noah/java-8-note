package com.example.java8note;

import java.util.Comparator;

public class equalsFun implements Comparator {
    public static void main(String[] args) {
        Integer s1 = 1231;
        Integer s2 = 1231;
        System.out.println("s1:"+Integer.toHexString(System.identityHashCode(s1)));
        System.out.println("s2:"+Integer.toHexString(System.identityHashCode(s2)));

        boolean equals = s1.equals(s2);
        System.out.println("equals:"+equals);

        boolean b = s1 == s2;
        System.out.println("==:"+b);

        int i = s1.compareTo(s2);
        System.out.println("i:"+i);
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }
}
