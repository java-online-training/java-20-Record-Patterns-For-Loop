package com.jot;

import java.util.List;

public class RecordPatternsForLoopExample {
    public static void main(String[] args) {
        List<Monkey> monkeys = List.of(new Monkey("Bert", 2), new Monkey("Jeff", 5), new Monkey("Ernie", 7));
        
        for (Monkey(String name, int age) : monkeys){
            System.out.println("Monkey "+ name + " is "+age+" years old.");
        }
    }
}

record Monkey(String name, int age){}
