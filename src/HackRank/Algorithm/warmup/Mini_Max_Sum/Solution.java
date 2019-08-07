package HackRank.Algorithm.warmup.Mini_Max_Sum;
import java.util.Scanner;
public class Solution {
// https://www.hackerrank.com/challenges/mini-max-sum/problem
    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr, long sum) {
    	long max = sum ;
    	long localMax = 0;
    	long min = sum;
    	long localMin = sum;
    	
    	for (int i = 0; i < arr.length; i++) {
    		if ((max - arr[i]) > localMax ) localMax = max - arr[i];
    		if ((min - arr[i]) < localMin ) localMin = min - arr[i];
		}
    	System.out.print(localMin+" "+localMax);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long sum = 0 ;
        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[ i] = arrItem;
            sum += arrItem;
        }
        miniMaxSum(arr, sum);

        scanner.close();
    }
}
