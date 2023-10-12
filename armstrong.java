//code2 for armstong

import java.io.*;
import java.util.*;

class armstrong
{
	public static void main(String args[])
	{
		int n=153,rev,temp=n,sum=0;
		while(n!=0)
		{
			rev=n%10;
			sum=sum + (rev*rev*rev);
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.print("It is armstrong number");
		}
		else
		{
		 	System.out.print("It is not armstrong number");
		}
	}
}