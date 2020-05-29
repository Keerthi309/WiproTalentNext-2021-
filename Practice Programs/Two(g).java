import java.util.*;
public class Simple 
{
      public static void main(String args[])
      {
          char a = 'Z';
          char temp = a;
          if(Character.isLowerCase(a))
          {
            System.out.println(temp+"->"+Character.toUpperCase(a));
          }
          else
          {
            System.out.println(temp+"->"+Character.toLowerCase(a));  
          }
      }
}