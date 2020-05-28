import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GFG { 
  
    // Function return a sting with all 
    // uppercase leter to the end of string 
    static public String move(String s) 
    { 
        // first take all lower case leter 
        // and take all uppercase letter 
        // and Finally concatenate both and return 
        return s.replaceAll("[A-Z]+", "") + s.replaceAll("[^A-Z]+", ""); 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner scanner = new Scanner( System. in);
        String str = scanner. nextLine();
        System.out.println("" + move(str)); 
    } 
} 