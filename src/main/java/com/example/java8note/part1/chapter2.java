package com.example.java8note.part1;

import com.example.java8note.entity.Apple;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.example.java8note.part1.chapter2I;


public class chapter2{
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeight(120);
        list.add(apple);
        prettyPrintApple(list, new chapter2I() {
            @Override
            public String accept(Apple a) {
                String characteristic = a.getWeight() > 150 ? "heavy" :
                        "light";
                return "A " + characteristic +
                        " " + a.getColor() +" apple";
            }
        });

        Runnable r1 = () -> System.out.println("Hello World 1");
        r1.run();

        Runnable r2 = new Runnable(){
            public void run(){
                System.out.println("Hello World 2");
            }
        };
        r2.run();

        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                        );
        pythagoreanTriples.forEach(t -> System.out.println("t:" + t[0]+ t[1]+t[2]));

        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);

    }

    public static void prettyPrintApple(List<Apple> inventory, chapter2I c) {
        for (Apple a : inventory) {
            String output = c.accept(a);
            System.out.println(output);
            c.equals(a);
            String s = "1";
            int i = 1;
            boolean b = false;
//            Boolean.compare(i);

            TreeMap t = new TreeMap();

            HashMap hashMap = new LinkedHashMap();

            Iterator iterator = new Iterator() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Object next() {
                    return null;
                }
            };
            Thread thread = new Thread();
            Executor executor = new Executor() {
                @Override
                public void execute(Runnable command) {

                }
            };

        }

    }
}
