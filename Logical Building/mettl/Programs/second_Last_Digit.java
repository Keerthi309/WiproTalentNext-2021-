import java.io.*;
import java.util.*;
//read only region start
  class UserMainCode
{
            public int lastDigitof(int input1){
              //read only region end
	      if(input1<0)
	      {
		  input1=-input1;
                  if(input1<10)
		  {
                       return -1;
                  }
		  else
		  {
		       return (input1%10);
	      	  }
	      }
              else
	      {
		  if(input1<10)
		  {
		      return -1;
		  }
		  else
		  {
		      return (input1%10);
		  }
              }

         }
 }