// Given two strings, write a method to decide if one is a permutation of the other?
import java.util.Arrays;
public class CheckPermutation{
	static String sort(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	static boolean permutation(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t));

	}
	public static void main(String args[]){
		System.out.println(permutation("Raftaar","Rashedin"));
	}
}