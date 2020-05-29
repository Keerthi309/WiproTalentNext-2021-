import java.util.*;
public class Simple{

     public static void main(String []args)
     {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr=new int[n];
    int temp=0;
    float avg;
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        temp=temp+arr[i];
    }
    avg=(float)temp/n;
    System.out.println(avg);
     }
}