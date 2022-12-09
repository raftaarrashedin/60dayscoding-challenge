// Question -> There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer,n , find and print the number of letter a's in the first n letters of the infinite string.

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
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        long total_full_string = n / s.length();
        long remainder = n % s.length();
        char [] c = s.toCharArray();
        long count = 0;
        for(int i = 0; i < s.length(); i++){
            if(c[i] == 'a') count++;
        }
        count *= total_full_string;
        for(int i = 0; i< remainder; i++){
            if(c[i] == 'a'){
                count++;
            }
        }
        return count;
    }

}

public class repeatedString {
    public static void main(String[] args) throws IOException {
        long result = Result.repeatedString(s, n);
        System.out.println(result)
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = bufferedReader.readLine();

        // long n = Long.parseLong(bufferedReader.readLine().trim());

        // long result = Result.repeatedString(s, n);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
