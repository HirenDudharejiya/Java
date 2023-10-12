//code3 discount

import java.io.*;
import java.util.*;

class code3
{
	public static void main(String args[])
	{
		float discount = 12,customerbill = 707.5f;
		float convertdis = 12/100f;
		float totalamount = customerbill * convertdis;
		float totalcustomerbill = customerbill - totalamount;
		System.out.println("Customer bill : " + customerbill);
		System.out.println("Discount given by shop : " + totalamount);
		System.out.println("Customer total bill : " + totalcustomerbill);
	}
}
