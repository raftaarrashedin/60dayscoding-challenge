// ek menu item banaye usme sub menu veg aur non veg,
// 5 non veg item,\
// 5 veg time,

import java.util.Scanner;

public class order{
	int costburger;
	int costpizza;
	int costmomos;
	int costnoodles;
	int costbiryani;
	int rate;
	int total(int rate){
		int tax = 50;
		this.rate = rate;
		int totalprice = rate + tax;
		System.out.println("Your cost : "+totalprice);
		System.out.println("Successfully ordered : we will touch in with you soon,");
	}

	int burger(int costburger){
		this.costburger = costburger;
	}
	int pizza(int costpizza){
		this.costpizza = costpizza;
	}
	int momos(int costmomos){
		this.costmomos = costmomos;
	}
	int noodles(int costnoodles){
		this.costnoodles = costnoodles;
	}
	int biryani(int costbiryani){
		this.costbiryani = costbiryani;
	}
	void displayBurger(){
		System.out.println("You have to PAY : "+costburger);
	} 
	void displayPizza(){
		System.out.println("You have to PAY : "+costpizza);
	}
	void displayMomos(){
		System.out.println("You have to PAY : "+costmomos);
	} 
	void displayNoodles(){
		System.out.println("You have to PAY : "+costnoodles);
	} 
	void displayBiryani(){
		System.out.println("You have to PAY : "+costbiryani);
	}
}
public class Cost{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		order od = new order();

		System.out.println("Welcome to TomaTo, Kindly Choose your Order : ");
		System.out.println("-------------------------------------------");
		System.out.println("Click 1 for Non Veg, and Click 2 for Veg.");
		int b = sc.nextInt();
		switch(b){
		case 1 : 
			System.out.println("Choose what makes you happy : ");
			System.out.println("Chicken Burger : Press 1 ");
			System.out.println("Chicken Pizza : Press 2 ");
			System.out.println("Chicken Momos : Press 3 ");
			System.out.println("Chicken Nooodles : Press 4 ");
			System.out.println("Chicken Biryani : Press 5 ");
			int a = sc.nextInt();
			switch(a){
				case 1 : 
					System.out.println("Booked");
					od.burger(100);
					od.displayBurger();
					break;


				case 2 : 
					System.out.println("Booked");
					od.pizza(100);
					od.displayPizza();
					break;


				case 3 : 
					System.out.println("Booked");
					od.momos(100);
					od.displayMomos();
					break;


				case 4 : 
					System.out.println("Booked");
					od.biryani(100);
					od.displayBiryani();
					break;


				case 5 : 
					System.out.println("Booked");
					od.noodles(100);
					od.displayNoodles();
					break;
				default:
					System.out.println(" ");
					break;
			}
		case 2:
			System.out.println("Choose what makes you happy : ");
			System.out.println("Veg Burger : Press 1 ");
			System.out.println("Veg Pizza : Press 2 ");
			System.out.println("Veg Momos : Press 3 ");
			System.out.println("Veg Nooodles : Press 4 ");
			System.out.println("Veg Biryani : Press 5 ");
			int x = sc.nextInt();
			switch(x){
				case 1 : 
					System.out.println("Booked");
					od.burger(100);
					od.displayBurger();
					break;


				case 2 : 
					System.out.println("Booked");
					od.pizza(100);
					od.displayPizza();
					break;


				case 3 : 
					System.out.println("Booked");
					od.momos(100);
					od.displayMomos();
					break;


				case 4 : 
					System.out.println("Booked");
					od.biryani(100);
					od.displayBiryani();
					break;


				case 5 : 
					System.out.println("Booked");
					od.noodles(100);
					od.displayNoodles();
					break;
				default:
					System.out.println(" ");
					break;
			}
			default:
					System.out.println(" ");
					break;
		}
		System.out.println("For pay choose one if not then exit");
		int c = sc.nextInt();
		switch(c){
			case 1: 
				ob.total();
				break;
			default: 
				System.out.println("We will meet soon, hope so.");		
		}



	}
}