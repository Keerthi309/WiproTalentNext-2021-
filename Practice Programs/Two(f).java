import java.util.*;
public class Simple 
{
      public static void main(String args[])
      {
        String a = args[0];
        String b = args[1];
        int c = Integer.parseInt(b);
        if(a=="Female"&&(c>=1&&c<=58))
        {
            System.out.println("Interest = 8.2%");
        }
        else if(a=="Female"&&(c>=59&&c<=120))
        {
            System.out.println("Interest = 7.6%");
        }
        if(a=="Male"&&(c>=1&&c<=60))
        {
            System.out.println("Interest = 9.2%");
        }
        if(a=="Female"&&(c>=61&&c<=120))
        {
            System.out.println("Interest = 8.3%");
        }
        
      }
}