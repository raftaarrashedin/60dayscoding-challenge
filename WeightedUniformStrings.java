import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedUniformStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        HashSet<Integer> map = new HashSet<Integer>();
        int i, j, curr;
        i = 0;

        while (i < s.length()) {
            j = i;
            curr = 0;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                curr += s.charAt(j++) - 'a' + 1;
                map.add(curr);
            }
            i = j;
        }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            if (map.contains(x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
