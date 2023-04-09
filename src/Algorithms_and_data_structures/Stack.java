package Algorithms_and_data_structures;

import java.util.*;

public class Stack {

    static List<Object> stack = new ArrayList<>();
    static String a = "a";
    static String b = "b";
    static String c = "c";

    public static void main(String[] args) {
        stack.add(b);
        stack.add(c);
        stack.add(a);

        System.out.println(Stack.getObject());
    }

    public static List<Object> addObject(Object obj) {
        stack.add(obj);
        return stack;
    }

    public static Object getObject() {
        return stack.get(stack.size() - 1);
    }
}
