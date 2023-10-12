// pattern 2

import java.io.*;

class pattern2
{
	public static void main(String args[])
	{
		int n=7;
		for(int i=n;i>=1;i--)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}