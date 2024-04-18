package com.hacker.rank;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder b=new StringBuilder(A);
        String a=b.reverse().toString();
        if(A.equals(a))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

	}

}
