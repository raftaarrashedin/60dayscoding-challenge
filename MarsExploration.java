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
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
// char[] ch = str.toCharArray();

        // char[] JavaCharArray = {'a', 'b', 'c', 'd', 'e'};  
    public static int marsExploration(String s) {
    // // Write your code here
    // char[] xd = {'s','o','s','s','o','s'};
    //     //String originalmessage = "SOS";
    //     char[] brokenmessage = s.toCharArray();
    //     //char[] realmessage = originalmessage.toCharArray();
    //     int i = 0, j,diffMsg=0;
    //     for(j = 0; j< brokenmessage.length;j++){
    //         if(brokenmessage[i] != xd[j]){
    //             diffMsg++;
    //         }
    //     }
    //     return diffMsg;
    
    
        char[] message = new char[]{'S','O','S'};
        int start = 0;
        int end = start + 3;
        int count = 0;
        while(end <= s.length()){
            String window = s.substring(start, end);
            for(int i = 0; i < message.length;i++){
                if(message[i] != window.charAt(i)) ++count;
            }
            start = end;
            end = start + 3;
        }
        return count;
    }

}

public class MarsExploration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
