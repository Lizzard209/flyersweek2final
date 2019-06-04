package flyersweek2final;

import java.util.Scanner;

public class Flyers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		float foodBill;
		int delivery = 0;
		int extraDelivery = 0;
		
		System.out.println ("Enter \"1\" for delivery. Enter \"2\" for Pick-Up : ");

		int option = scan.nextInt();

		
		//if (option == 2)
		//	System.out.println("What would you like to eat?");

		
		if (option == 1)
		{
			System.out.println ("Enter your zip code:");
		
		
		final int MAX = 15455;
		final int MIN = 15445;
		
		int zipcode = scan.nextInt();
		
				
				if (zipcode > MAX || zipcode < MIN)
					System.out.println ("Delivery Not Avaiable");
				// need to loop this back?? or end it?

				else {
					
				if (zipcode < MAX && zipcode> MIN)
					System.out.println ("Delivery Avaiable");
					delivery = 1;
					extraDelivery = 0;
				if (zipcode == MAX)
					System.out.println ("Delivery with extra cost");
					delivery = 0;
					extraDelivery = 1;
				if (zipcode == MIN)
					System.out.println ("Delivery with extra cost");
					delivery = 0;
					extraDelivery = 1;
				}}
				
		System.out.println ("What would you like to eat? ");
		foodBill = menu();
		
		System.out.println ("Would you like to order something else? type 1 for yes, 2 for no");
		int orderMore = scan.nextInt();
				
				if (orderMore == 1) {
				 foodBill=foodBill+menu();
				}
				
				if (orderMore == 2) {
					 foodBill=foodBill;
					}
			
				
				 foodBill= foodBill+foodBill*0.05f;
					if (delivery == 1)
					foodBill=foodBill+5.00f;
				if (extraDelivery == 1)
					foodBill=foodBill+7.00f;
				
		System.out.println("Your total is: $" + foodBill);

		}

		public static float menu() {
		    float bill = 0;
			System.out.println ("Enter 1 to order Flyers' Burger: $4.50");
			System.out.println ("Enter 2 to order Flyers' Drink: $1.50");
			System.out.println ("Enter 3 to order Flyers' Fries: $2.50");
			System.out.println ("Enter 4 to order Flyers' Dessert: $3.00");
			
			Scanner scan = new Scanner(System.in);
			int order = scan.nextInt();
			
			if (order == 1)
				bill = 4.50f; 
			if (order == 2)
				bill = 1.50f; 
			if (order == 3)
				bill = 2.50f; 
			if (order == 4)
				bill = 3.00f; 
			return bill;


	}

}
