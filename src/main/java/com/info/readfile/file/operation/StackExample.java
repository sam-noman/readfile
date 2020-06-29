package com.info.readfile.file.operation;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        pushStack(stack);
        popStack(stack);
    }

    public static void pushStack(Stack<Integer> stack){
        for(int i=0; i < 10; i++){
            stack.push(i);
        }
        System.out.println("size: "+stack.size());
        System.out.println("Peek from stack: "+stack.peek());

    }

    public static void popStack(Stack<Integer> stack){
        System.out.println("Pop from stack: "+stack.pop());

        // for(int i=0; i < stack.size(); i++){
        for(int i=0; i < 9; i++){
            Integer integer = stack.pop();
            System.out.println(integer);
        }
        System.out.println(stack.size());
    }
}
