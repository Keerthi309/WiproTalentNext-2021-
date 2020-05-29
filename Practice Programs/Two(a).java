import java.util.*;
public class Simple 
{
      public static void main(String args[])
      {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            int i = Integer.parseInt(s);
            if(i>=0)
            {
                System.out.println("Positive");
                
            }
            else
                {
                    System.out.println("Negative");
                }
                in.close();
            }
      }