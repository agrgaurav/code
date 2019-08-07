package HackRank.Algorithm.warmup.Diagonal_Difference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// Question Url : https://www.hackerrank.com/challenges/diagonal-difference/problem

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(int[][] arr, int n) {
    int pd = 0;
    int sd = 0;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j ) {
                    pd += arr[i][j];
                }   
                if(i == (n-j-1)) {
                     sd += arr[i][j];
                }  
                
            }
        }
         return Math.abs(pd - sd);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int arr[][] = new int[n][n]; 

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

 
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(arrRowTempItems[j]);
            }
        }

        int result = Result.diagonalDifference(arr, n);

        bufferedWriter.write(String.valueOf(result));

        bufferedReader.close();
        bufferedWriter.close();
    }
}
