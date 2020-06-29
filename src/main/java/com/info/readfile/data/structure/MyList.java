package com.info.readfile.data.structure;


import java.util.Iterator;
import java.util.LinkedList;

public class MyList {

    public static void main(String[] args) {
        linkedListExample();
    }

    public static void linkedListExample(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("bangladesh");
        list.add("Canada");
        list.add("America");
        System.out.println("list: " + list);

        LinkedList<String> list2 = new LinkedList<String>();

        list2.add("Congo");
        list2.add("USA");
        // list.addAll(list2);

        System.out.println("list: " + list);

        list.addAll(1, list2);

        System.out.println("list: " + list);

        System.out.println(list.contains("USA"));

        Iterator it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.println("hi: " + it.next());
        }
    }

}
