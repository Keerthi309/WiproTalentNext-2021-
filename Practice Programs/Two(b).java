import java.util.*;
public class Simple 
{
      public static void main(String args[])
      {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            int i = Integer.parseInt(s);
            if(i>0)
            {
                if(i%2==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
            }
            else
            {
                System.out.println("Zero");
            }
            in.close();
      }
}