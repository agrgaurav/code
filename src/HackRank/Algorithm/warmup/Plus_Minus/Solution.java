package HackRank.Algorithm.warmup.Plus_Minus;

import java.util.Scanner;

// Question Url : https://www.hackerrank.com/challenges/plus-minus/problem?h_r=next-challenge&h_v=zen

class Solution {

	 // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int plus = 0, minus = 0, zero = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if(arr[i]>0) ++plus;
    		if(arr[i]<0) ++minus;
    		if(arr[i]==0) ++zero;
		}

        System.out.printf("%.6f %n%.6f %n %.6f %n",(float)plus/arr.length,(float)minus/arr.length,(float)zero/arr.length);        
  

    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        sc.close();
    }
}
