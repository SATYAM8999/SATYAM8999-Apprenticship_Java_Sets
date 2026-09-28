
package com.mycompany.set64;


public class Set64_13 
{
    public static void main(String args[])
    {
       int n=10;
       int f1=0,f2=1,f3=1,f4;
       int sign=1;
       int sum=0;
       for(int i=1;i<=10;i++)
       {
      
           f4=f1+f2+f3;
          // System.out.println(f4);
           int x=sign*f4;
           System.out.println(x);
           sum=sum+x;
           f1=f2;
           f2=f3;
           f3=f4;
           sign=-sign;
       }
        System.out.println("Sum="+sum);
       
        
    }
}
