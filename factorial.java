public class factorial{
	int fact = 1;
	public static void main(String args[]){
		int no=5, res;
		factorial f = new factorial();
		res = f.callFact(no);
		System.out.println(res);
	}
	int callFact(int no){
		if(no>1){
			fact = fact * no;
			callFact(no - 1);		
		}
			return fact;

	}
}