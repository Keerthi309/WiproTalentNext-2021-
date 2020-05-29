import java.util.*;
public class CmdLine 
{
      public static void main(String args[])
      {
            int a,b,sum;
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            sum=a+b;
            System.out.println("sum of " + a + " and " + b +" is " +sum);
      }
}