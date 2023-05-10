package com.jot;

import java.util.List;

public class RecordPatternsForLoopExample {
    public static void main(String[] args) {
        printMonkeyData();

        printZooData();
    }

    private static void printMonkeyData(){
        List<Monkey> monkeys = List.of(new Monkey("Bert", 2), new Monkey("Jeff", 5), new Monkey("Ernie", 7));
        for (Monkey(String name, int age) : monkeys){
            System.out.println("Monkey "+ name + " is "+age+" years old.");
        }
    }

    private static void printZooData(){
        List<Zoo> zoos = List.of(new Zoo(new Monkey("Jeff",5), new Donkey("Bob", 4)), new Zoo(new Monkey("Charles",5), new Donkey("Sierra", 12)));
        for (Zoo(Monkey(String mName, int mAge), Donkey(String dName, int dAge)) : zoos){
            System.out.println("The zoo has a monkey "+mName+ " and a donkey "+dName);
        }
    }

}

record Monkey(String name, int age){}

record Donkey(String name, int age){}

record Zoo (Monkey monkey, Donkey donkey){}