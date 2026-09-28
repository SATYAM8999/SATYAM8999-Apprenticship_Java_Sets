
package com.mycompany.set67;

import java.util.Scanner;


public class Set67_7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size=sc.nextInt();
        
        int a[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<a.length-1;i++)
        {
            
            if(a[i]>a[i+1])
            {
                flag=false;
                 break;
            }
            
                
        }
        if(flag)
        {
            System.out.println("Array Are Sorted in Ascending order");
          
        }
        else
            System.out.println("Array Are not Sorted in Ascending order");
            
    }
    
}
