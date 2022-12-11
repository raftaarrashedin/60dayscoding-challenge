class prime_No{
	public static void main(String args[]){
		int flag=0,number=10;
		for(int i=1; i<number; i++){
			if(number%i == 0){
				flag++;
			}
		}
		if(flag == 0){
			System.out.println(number+" is prime number.");
		}else{
			System.out.println("number is not prime number.");
		}
	}
}