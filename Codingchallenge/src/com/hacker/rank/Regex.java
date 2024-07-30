package com.hacker.rank;

import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}


class MyRegex {
    
        
    String pola = "([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])";
    String pattern = "^" + pola + "\\." + pola + "\\." + pola + "\\." + pola + "$";
    
    
    }