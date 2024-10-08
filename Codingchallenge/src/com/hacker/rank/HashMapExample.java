package com.hacker.rank;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample { 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hmap = new HashMap<String, Integer>(); 
        int n = in.nextInt();
        in.nextLine(); 
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            hmap.put(name, phone);
            in.nextLine(); 
        }
        
        while (in.hasNext()) {
            String s = in.nextLine();
            if (hmap.containsKey(s)) {
                System.out.println(s + "=" + hmap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        
        in.close(); 
    }
}
