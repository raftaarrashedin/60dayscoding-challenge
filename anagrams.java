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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        // Write your code here
        if(s.length() % 2 != 0) return -1;
        char [] s1 = (s.substring(0,s.length()/2)).toCharArray();
        char [] s2 = (s.substring(s.length()/2,s.length())).toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.toString(s1).equalsIgnoreCase(Arrays.toString(s2))) return 0;
        int count = 0;
        int [] hash = new int[126];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i)-'a'] += i < s.length()/2 ? 1 : -1;
        }
        for(int ha : hash ) {
            if(ha > 0){
                count += ha;
            }
        }
        return count;
    }

}

public class anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.anagram(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
