public class LargestOfTwo_{
	public static void main(String args[]){
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		if(i > j){
			System.out.println("First number is greater than Second number");
		}else{
			System.out.println("Second number is greater than First");
		}
	}
}