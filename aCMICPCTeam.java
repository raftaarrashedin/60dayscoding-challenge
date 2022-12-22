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
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        List<Integer> result = new ArrayList<>();
        
        int m = topic.get(0).length(); //length of every string
        
        int max = 0; //no of 1's
        int maxTopicTeams = 0;
        for(int i=0; i<topic.size()-1; i++) {
            String str1 = topic.get(i);
            for(int j=i+1; j<topic.size(); j++){
                int cntOfOnes = 0;
                String str2 = topic.get(j);
                for(int k=0; k<m ;k++){
                    if(str1.charAt(k) == '1' || str2.charAt(k) == '1'){
                        ++cntOfOnes;
                    }
                }
                
                if(cntOfOnes > max){
                    max = cntOfOnes;
                                        //from this we get the 1st max topic team
                    maxTopicTeams = 1; 
                }
                else if(cntOfOnes == max){
                    ++maxTopicTeams;
                }
            }
        }
        
        //push the values into array
        result.add(max);
        result.add(maxTopicTeams);
        
        return result;
    }

}

public class aCMICPCTeam {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
