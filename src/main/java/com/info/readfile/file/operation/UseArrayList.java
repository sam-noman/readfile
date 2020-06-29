package com.info.readfile.file.operation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your limit");
        int limit = sc.nextInt();
        System.out.println("please enter your number");
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < limit; i++) {
            list.add(sc.nextInt());
        }

        for (Integer v : list) {
            System.out.println("Value: "+ v);
        }

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("bangladesh");

    }

    @Override
    public void finalize(){
        System.gc();
    }

}
