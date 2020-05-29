import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    public static int checkPower(List<Integer> numbers) {
     int i = 0,n,j=0;
     ArrayList<Integer> list=new ArrayList<Integer>();
        int size = arr.size();
        while(i < size) {
            n= arr.get(i);
            if(n%2==0||n==0)
             {
                 list.add(1);
             }
             else
             {
                list.add(0);
             }
            i++;
        }
        return list;
    }

}