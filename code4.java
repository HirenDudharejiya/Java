//code4 for product


import java.io.*;
import java.util.Scanner;


class code4
{
	public static void main(String args[])
	{
	Scanner Sc = new Scanner(System.in);
	float p1 = 99.90f;
        float p2 = 20.20f;
        float p3 = 6.87f;
        float p4 = 45.50f;
        float p5 = 40.49f;

        System.out.println("Welcome to CREAFTHOLIC");
        System.out.println("Here are some our Best Product's");

        boolean entry = true;
        float p1Amount = 0, p2Amount = 0, p3Amount = 0, p4Amount = 0, p5Amount = 0;

        while (entry) {
            System.out.println();
            System.out.println("Product 1 : handmade Ganpati : Rs. 99.90");
            System.out.println("Product 2 : Venice Fabric Globe 20x23x30 Cm in Mustard & White Colour : Rs. 20.20 ");
            System.out.println("Product 3 : Walton Wood Horse Figurine in Natural Wood Colour : Rs. 6.87");
            System.out.println("Product 4 : Naqsh Polyresin 3 Wise Monk Set in Yellow Colour : Rs. 45.50 ");
            System.out.println("Product 5 : Miraya Polyresin Posing Lady Figurine 24Cm in Gold Colour : Rs. 40.49 ");

            System.out.println();
            System.out.println("if you want to buy then Enter Product Number or For Exit press 6");
            System.out.println("Number : ");
            int number = Sc.nextInt();
            switch (number) {
                case 1: {
                    System.out.println("You Choose handmade Ganpati");
                    System.out.println("Excellent Choice!");
                    System.out.println("How many Item do you Want?");
                    System.out.println("Enter Quantity :: ");
                    int Quantity = Sc.nextInt();
                    System.out.println("Product Price is : " + p1);
                    System.out.println("Quantity : " + Quantity);
                    p1Amount = Quantity * p1;
                    System.out.println("Amount : " + p1Amount);
                }
                    break;
                case 2: {
                    System.out.println("You Choose Venice Fabric Globe 20x23x30 Cm in Mustard White Colour");
                    System.out.println("Wise Decision!");
                    System.out.println("How many Item do you Want?");
                    System.out.println("Enter Quantity :: ");
                    int Quantity = Sc.nextInt();
                    System.out.println("Product Price is : " + p2);
                    System.out.println("Quantity : " + Quantity);
                    p2Amount = Quantity * p2;
                    System.out.println("Amount : " + p2Amount);
                }
                    break;

                case 3: {
                    System.out.println("You Choose Walton Wood Horse Figurine in Natural Wood Colour");
                    System.out.println("Excellent Decision!");
                    System.out.println("How many Item do you Want?");
                    System.out.println("Enter Quantity :: ");
                    int Quantity = Sc.nextInt();
                    System.out.println("Product Price is : " + p3);
                    System.out.println("Quantity : " + Quantity);
                    p3Amount = Quantity * p3;
                    System.out.println("Amount : " + p3Amount);
                }
                    break;

                case 4: {
                    System.out.println("You Choose Naqsh Polyresin 3 Wise Monk Set in Yellow Colour ");
                    System.out.println("Excellent Decision!");
                    System.out.println("How many Item do you Want?");
                    System.out.println("Enter Quantity :: ");
                    int Quantity = Sc.nextInt();
                    System.out.println("Product Price is : " + p4);
                    System.out.println("Quantity : " + Quantity);
                    p4Amount = Quantity * p4;
                    System.out.println("Amount : " + p4Amount);
                }
                    break;
                case 5: {
                    System.out.println("You Choose Miraya Polyresin Posing Lady Figurine 24Cm in Gold Colour ");
                    System.out.println("Excellent Decision!");
                    System.out.println("How many Item do you Want?");
                    System.out.println("Enter Quantity :: ");
                    int Quantity = Sc.nextInt();
                    System.out.println("Product Price is : " + p5);
                    System.out.println("Quantity : " + Quantity);
                    p5Amount = Quantity * p5;
                    System.out.println("Amount : " + p5Amount);
                }
                    break;
                default: {
                    System.out.println("Exit Successfully");
                    entry = false;
                }
            }
        }
        float totalAmount = p1Amount + p2Amount + p3Amount + p4Amount + p5Amount;
        System.out.println("Total Bill :: " + totalAmount);
	}
}

