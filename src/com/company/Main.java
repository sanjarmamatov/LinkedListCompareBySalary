package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Empl> list = new LinkedList<Empl>();
        list.add(new Empl("Sanj ", 15000));
        list.add(new Empl("Max ", 12000));
        list.add(new Empl("Misha ", 11000));
        list.add(new Empl("Sasha ", 17500));
        Collections.sort(list, new MySalaryComp());
        System.out.println("Отсортированный список: " + list);


	// write your code here
    }
}
