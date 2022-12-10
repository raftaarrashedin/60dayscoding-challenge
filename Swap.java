import java.util.*;
class Swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int n = sc.nextInt();

		System.out.println("Enter the second number : ");
		int m = sc.nextInt();

		System.out.println("the numbers before swapping : "+n);
		System.out.println("the numbers before swapping : "+m);


		System.out.println("Numbers after swapping : ");
	
		n = n + m;
		m = n - m;
		n = n - m;
	
		System.out.print(" the values  : "+n);
		System.out.print("  "+m);

	}
}