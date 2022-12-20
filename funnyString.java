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
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        // Write your code here
        int size = s.length();
        char str[] = s.toCharArray();
        
        int arr[] = new int[size-1];
        int i = 0,j;
        for(i = 0; i < size-1; i++){
            arr[i] = Math.abs((int)str[i] - (int)str[i+1]);
            
        }
        for(i = 0,j = arr.length - 1; i<j ; i++,j--){
            if(arr[i] != arr[j]){
                return "Not Funny";
            }
        }
        return "Funny";
    }

}

public class funnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
