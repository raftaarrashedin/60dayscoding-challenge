import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int making_Anagrams(String s1, String s2) {
        // Write your code here
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            int ind = ch - 'a';
            freq1[ind]++;
        }
        
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            int ind = ch - 'a';
            freq2[ind]++;
        }
        int diff = 0;
        for(int i=0; i<26; i++){
            diff += Math.abs(freq1[i]-freq2[i]);
        }
        return diff;
        // char [] s11 = s1.toCharArray();
        // char [] s22 = s2.toCharArray();
        // // if(s1.length > s2.length)
        //  int l = Math.abs(s1.length() - s2.length());
        // int i=0;
        // int j = i+1;
        // int count = 0;
        // char [] sortS1 = Arrays.sort(s11);
        // char [] sortS2 = Arrays.sort(s22);
        // for(i = 0; i < s1.length();i++){
        //     if(sortS1[i] != sortS1[j]){
        //         count++;
        //     }
        //     if(s1.length() == s2.length()){
        //         count += l;
        //     }
        //     if(s1.length() > s2.length()){
        //         count += l;
        //     }else if(s1.length() < s2.length()){
        //         count +=l;
        //     }else{
        //         count += l;
        //     }
        // }
        // return count;
    }

}

public class makingAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.making_Anagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
