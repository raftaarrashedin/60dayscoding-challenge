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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

     public static String pangrams(String s) {
    // Write your code here
      int c = 26;
        int dp[] = new int[27];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            ch = Character.toLowerCase(ch);
            
            int idx =  ch - 'a'; 
            //System.out.println(idx);
            if(idx < 0 || idx >= 26) continue;
            dp[idx]++;
            if(dp[idx] > 1) continue;
            c--;
            if(c == 0) return "pangram";
            
        }
        
        return "not pangram";

    }

    }
public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
