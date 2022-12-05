//DAY 4
public class palindrome{
	public static void main(String args[]){
		int no=383;
		int temp = no;
		int rev =0,rem =0;
		while(temp != 0){
			rem = temp % 10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(no == rev){
			System.out.println(no+" is palindrome Number.");
		}
	}
}