// Day 4-
// Palindrom Permutation :- Given a String, Write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forward or bacwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 
import java.io.*;
import java.util.Scanner;
import java.util.*;
class palindromPermutation{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scn.next();
		HashMap<Character, Integer> fmap = new HashMap<>();
		for(int i = 0; i < str.length();i++){
			char ch = str.charAt(i);
			if(fmap.containsKey(ch)){
				int of = fmap.get(ch);
				fmap.put(ch, of+1);
			}else{
				fmap.put(ch,1);
			}
		}
		Character odd = null;
		int odds = 0;
		int len = 0;
		for(char ch : fmap.keySet()){
			int freq = fmap.get(ch);

			if(freq % 2 == 1){
				odd = ch;
				odds++;
			}
			fmap.put(ch,freq/2);
			len +=freq / 2;
		}
		generatepw(1,len,fmap,odd,"");
	}
	public static void generatepw(int cs, int ts, HashMap<Character,Integer> fmap,Character odds, String asf){
		if(cs>ts){
			String rev = " ";
			for(int i = asf.length()-1; i>=0; i--){
				rev += asf.charAt(i);
			}
			String res = asf;
			if(odds != null){
				res +=odds;
			}
			res += rev;
			System.out.println(res);
			return;
		}
		for(char ch : fmap.keySet()){
			int freq = fmap.get(ch);
			if(freq>0){
				fmap.put(ch,freq-1);
				generatepw(cs+1, ts, fmap,odds,asf+ch);
				fmap.put(ch, freq);
			}
			
		}
	}
}