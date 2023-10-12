// pattern 1

import java.io.*;

class pattern1
{
	public static void main(String args[])
	{
		int n=5,num=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num + " ");
				num++;
			}
		System.out.println();
		}
	}
}
