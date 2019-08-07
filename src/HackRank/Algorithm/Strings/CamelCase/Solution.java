package HackRank.Algorithm.Strings.CamelCase;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "saveChangesInTheEditor"; 
        String[]  l = s.split("(?=\\p{Upper})");
 
        System.out.println(l.length); 

//        bufferedWriter.close();
//
//        scanner.close();
    }
}
