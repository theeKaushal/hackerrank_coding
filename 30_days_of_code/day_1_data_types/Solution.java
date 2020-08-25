import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        while (scan.hasNext()) {
         // if the next is a int, print found and the int
         if (scan.hasNextInt()) {
            i = i + scan.nextInt();
         } else {
            String str = scan.nextLine();
            try
            {
                d = d + Double.parseDouble(str.trim());
            }
            catch(NumberFormatException e)
            {
                s = s + str;
            }
         }
        }

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s);

        scan.close();
    }
}