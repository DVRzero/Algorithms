package Algorithms_and_data_structures;

import java.util.*;

public final class Queue {

    static List<Object> queue = new ArrayList<>();
    static String a = "a";
    static String b = "b";
    static String c = "c";

    public static void main(String[] args) {
        queue.add(b);
        queue.add(c);
        queue.add(a);

        System.out.println(Queue.getObject());
    }

    public static List<Object> addObject(Object obj) {
        queue.add(obj);
        return queue;
    }

    public static Object getObject() {
        return queue.get(0);
    }
}
