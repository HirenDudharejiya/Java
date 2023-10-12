//code 1 for multipliaction table

import java.io.*;
import java.util.*;

class code1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			System.out.println(i + "th table started");
			for(int j=1;j<=10;j++)
			{
				System.out.println(i + "*" + j + "=" + (j*i));
			}
		System.out.println();
		}
	}
}