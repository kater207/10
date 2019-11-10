package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(10);
        LinkedList<String> list2 = new LinkedList<String>();
        list.add(0,"Lviv");
        list.add("Harkiv");
        list.add("Cherkassy");
        list.add("Dnepr");
        list.add("Odessa");
        list.add(1,"Kirovograd");
        list.add("Symu");
        list.add("Vinnitsa");
        list.add(5,"Nikolaev");
        list.add("Chernigiv");

        System.out.println(list.toString());
        list.addAll(2, Collections.singleton("Chernivtsi"));
        System.out.println(list.toString());

        list.remove("Odessa");
        System.out.println(list.toString());

        list.remove(1);
        System.out.println(list.toString());

        System.out.println(list.get(3));

        list.contains("Odessa");
        System.out.println(list.toString());

        System.out.println(list.size());

        list2.add("Hello");
        list2.add("world");
        list2.remove(1);
        System.out.println(list2.toString());
        list.clear();
        System.out.println(list.toString());


    }
}
