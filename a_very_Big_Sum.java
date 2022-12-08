import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class a_very_Big_Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long sum = 0;
		while(t-- > 0){
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
}