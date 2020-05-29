import java.util.*;
public class Simple 
{
      public static void main(String args[])
      {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if(c=='R')
        {
            System.out.println("Red");
        }
        else if(c=='G')
        {
            System.out.println("Green");
        }
        else if(c=='B')
        {
            System.out.println("Blue");
        }
        else if(c=='O')
        {
            System.out.println("Orange");
        }
        else if(c=='Y')
        {
            System.out.println("Yellow");
        }
        else if(c=='W')
        {
            System.out.println("White");
        }
        else
        {
            System.out.println("Invalid Code");
        }
        in.close();
      }
}