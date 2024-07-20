package com.hacker.rank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean anagramCheck(String a,String b)
	{	    
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
					
					
		return Arrays.equals(arr1, arr2);
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the first input:");
		String a=scanner.next();
		System.out.println("Enter the second input:");
		String b= scanner.next();
		if(anagramCheck(a,b))
		{
		System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not a anagrams");
		}
		

	}

}
