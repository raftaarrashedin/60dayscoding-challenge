import java.util.Scanner;
public class digits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		int remainder, temp , sum = 0, product = 1;
		temp = number;
		while(temp != 0){
			remainder = temp % 10;
			sum = sum + remainder;
			product = product * remainder;
			temp = temp / 10;
		}
		System.out.println("Sum of digits of number " +number+ " : " +sum );
		System.out.println("Product of digits of number " +number+ " : " +product );

	}
}
// output

// C:\Users\Sgrams\Desktop\java\4june_java>java digits
// Enter number :
// 787979
// Sum of digits of number 787979 : 47
// Product of digits of number 787979 : 222264