package com.syntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pratik {
    public static void main(String[] args) {

        TreeMap<Integer, String> company=new TreeMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Firefox");
        company.put(4,"Apple");
        company.put(5,"Excel");
        company.put(6,"World,PDF");
        company.put(6,"World");

        for(Map.Entry<Integer,String> c:company.entrySet()){
            System.out.println(c.getKey());
            System.out.println(c.getValue());

        }

//        System.out.println(company.size());
//        System.out.println(company);
//        company.replace(5,"Excel","Banana");
//        System.out.println(company);
//
//        company.remove(3);
//        System.out.println(company);
//        System.out.println(company.entrySet());



    }
}
