package HackRank.Algorithm.warmup.Time_Conversion;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	;
		int hh = 0;
		String arr[] = s.split(":");

		hh = Integer.parseInt(arr[0]); 

		if (arr[2].substring(2).contentEquals("PM") && hh < 12 && hh > 0) {
			hh += 12;
			return hh + ":" + arr[1] + ":" + arr[2].substring(0, 2);
		}
		if (arr[2].substring(2).contentEquals("AM") && hh == 12 ) {
			return  "00:" + arr[1] + ":" + arr[2].substring(0, 2);
		}

		return arr[0] + ":" + arr[1] + ":" + arr[2].substring(0, 2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);

        bw.close();
    }
}
