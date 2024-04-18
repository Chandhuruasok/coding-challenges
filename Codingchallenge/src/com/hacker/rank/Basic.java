package com.hacker.rank;
import java.util.*;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N value:");
		int N=s.nextInt();
		if(N<0)
		{
			System.out.println("Enter the N value:");
			N=s.nextInt();
		}
		if(N%2!=0)
        {
            System.out.println("Weird");
        }
        else if(N>2 && N<5)
        {
            if(N%2==0)
            {
                System.out.println("Not Weird");
            }
            
        }
        else if(N>6 && N<20)
        {
            if(N%2==0)
            {
                System.out.println("Weird");
            }
        }
        else
        {
            System.out.println("Not Weird");
        }
	}

	}
