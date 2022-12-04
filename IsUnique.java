public class isUnique{
	public boolean isUnique1(String str){
		if(str.length()>128){
			return false;
		}
		boolean [] charset = new boolean[128];
		for(int i = 0; i<str.length(); i++){
			if(!charset[str.charAt(i)]){
				charset[str.charAt(i)] = true;
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		isUnique iq = new isUnique();
		System.out.println(iq.isUnique1("abcd"));
	}
}