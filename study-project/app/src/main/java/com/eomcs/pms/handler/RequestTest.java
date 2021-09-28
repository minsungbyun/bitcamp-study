package com.eomcs.pms.handler;

import java.util.ArrayList;
import java.util.HashMap;

public class RequestTest {

  public static void main(String[] args) {

    HashMap<String,Integer> map = new HashMap<>();

    map.put("no1", 1);
    map.put("no2", 2);
    map.put("no3", 3);
    map.put("no4", 4);
    map.put("no5", 5);

    Integer test = map.get("no3");
    System.out.println(test);


    //    ArrayList<Integer> list = new ArrayList<>();
    //    list.add(1);
    //    list.add(2);
    //    list.add(3);
    //    list.add(4);
    //    list.add(5);
    ArrayList<String> list = new ArrayList<>();
    list.add("1\n");
    list.add("1");
    list.add("1");
    list.add("1");
    list.add("1");

    System.out.println(list);
    System.out.println(list.get(0));





  }

}
