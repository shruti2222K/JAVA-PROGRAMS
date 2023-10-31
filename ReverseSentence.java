import java.io.*;
import java.lang.*;
import java.util.*;
 
class ReverseSentence {
    public static void printWords(String str)
    {
        // word variable to store word
        String word;
 
        // making a string stream
        StringTokenizer iss = new StringTokenizer(str);
 
        // Read and print each word.
        while (iss.hasMoreTokens()) {
            word = iss.nextToken();
            System.out.print(
                new StringBuilder(word).reverse().toString()
                + " ");
        }
    }
 
    public static void main(String[] args)
        throws java.lang.Exception
    {
        String s = "This is a sunny day";
        printWords(s);
    }
}
 