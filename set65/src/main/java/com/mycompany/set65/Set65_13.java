
package com.mycompany.set65;

import java.util.Scanner;


public class Set65_13 
{
    public static void main(String args[])
    {
        int n=154,i=1;
        double sum=0;
         int x=3;
        while(n>=i)
        {
            double value=((double)i/(x+i));
            sum=sum+value;
            i++;
            
        }
        System.out.println("Sum="+sum);
    }
 }
   

