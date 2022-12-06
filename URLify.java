//Question Day 5
// Write a method to replace all spaces in a string with '%20'.
// You may asssume that the string has sufficient space at the end 
// to hold the additional Characters, and that you're given the "true" length of the string.

import java.util.Scanner;
public class URLify{
	public static void main(String args[]){
		String str = " Rashedin";
		replaceSpace(str.toCharArray(), str.trim().length());
	}
	static void replaceSpace(char[] str, int truelength){
		int spaceCount=0, index, i = 0;
		for(i = 0; i<truelength;i++){
			if(str[i]== ' '){
				spaceCount++;
			}
		}
		index = truelength+ spaceCount*2;
		if(truelength<str.length){
			str[truelength] = '\0';
		}
		for(i = truelength-1; i>=0; i--){
			if(str[i]==' '){
				str[index - 1]= '0';
				str[index - 2]= '2';
				str[index - 3]= '%';
				index = index - 3;
			}else{
				str[index - 1] = str[i];
				index--;
			}
		}
		System.out.println(str);
	}  
}