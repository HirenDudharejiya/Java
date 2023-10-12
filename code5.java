//code5 for electicity bill

import java.io.*;
import java.util.*;

class code5
{
	public static void main(String args[])
	{
		System.out.println("An electicity board charges different rates for different categories of consumption of power");
		System.out.println();
		System.out.println("Category 1 is domestic users");
		System.out.println("Category 2 is educational institute");
		System.out.println("Category 3 is commercial institute");
		System.out.println("Category 4 is industries");
		System.out.println();
		System.out.println("The traffic for energy consumption is \n" + 
				   "Rs. 1.00/unit for Category 1,\n" +
				   "Rs. 1.75/unit for Category 2,\n" +
				   "Rs. 2.50/unit for Category 3,\n" +
				   "Rs. 3.00/unit for Category 4,\n");
		System.out.println();
		System.out.println("Raman lies on Category 1");
		System.out.println("Electicity bill : " + (float)(1.00*85));
		System.out.println("Balaji lies on Category 1");
		System.out.println("Electicity bill : " + (float)(1.00*255));
		System.out.println("Balaji lies on Category 2");
		System.out.println("Electicity bill : " + (float)(1.75*925));
		System.out.println("ABC lies on Category 3");
		System.out.println("Electicity bill : " + (float)(2.50*650));
		System.out.println("R.M.K lies on Category 4");
		System.out.println("Electicity bill : " + (float)(3.00*13750));
	}
}
