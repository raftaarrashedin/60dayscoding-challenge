import java.util.Scanner;
public class ProjectEuler01{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //int t = new Scanner(System.in);
        int t = in.nextInt();
        int n, i, j;
        long sum = 0;
        int arr[] = new int[t];
        
        for(i = 0; i < t; i++){
            n = in.nextInt();
            arr[i] = n;
            
        }
        for(i = 0; i <t; i++){
            for(j = 0; j < arr[i]; j++){
                long mulThree = (arr[i]-1) / 3;
                long mulFive = (arr[i] - 1) / 5;
                long mulFifteen = (arr[i] - 1) / 15;
sum = (3 * (mulThree * (mulThree + 1)) / 2) + (5 * (mulFive *( mulFive +1))/2) - (15 * (mulFifteen * (mulFifteen +1))/2);
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}