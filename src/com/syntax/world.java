package com.syntax;

import java.util.HashSet;


public class world {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("first");
        set.add("second");
        set.add("third");

        System.out.println(set);
        set.clear();
        System.out.println(set);



    }
}
