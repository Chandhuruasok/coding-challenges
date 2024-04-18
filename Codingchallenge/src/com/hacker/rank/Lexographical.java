package com.hacker.rank;
import java.util.*;
public class Lexographical {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum=A.length()+B.length();
        System.out.println(sum);
        int n=A.compareTo(B);
        if(n>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        String output1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String output2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output1+" "+output2);
        System.out.println("successfully completed");
        System.out.println("");

	}

}
