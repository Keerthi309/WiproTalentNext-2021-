import java.io.*;
import java.util.*;

class UserMainCode
{
    public int isMultiple(int input1,int input2,int input3,int input4,int input5,String input6){   

    int c_even=0,c_odd=0;
    char *s="even";
    int result=strcmp(input6,s);
    if(result==0)
    {
        if(input1%2==0)
           c_even++;
        if(input2%2==0)
            c_even++;
        if(input3%2==0)
            c_even++;
        if(input4%2==0)
            c_even++;
        if(input5%2==0)
            c_even++;
    return c_even;
    }
    else
    {
        if(input1%2!=0)
           c_odd++;
        if(input2%2!=0)
            c_odd++;
        if(input3%2!=0)
            c_odd++;     
        if(input4%2!=0)
            c_odd++;
        if(input5%2!=0)
            c_odd++;
    return c_odd;
    }

  }
}