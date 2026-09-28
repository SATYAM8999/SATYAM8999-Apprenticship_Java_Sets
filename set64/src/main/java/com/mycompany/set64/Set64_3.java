/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_3 
{ 
    public static void main(String args[])
    {
        int n=7;
        int mid=n/2+1;
        for(int i=1;i<=n;i++)
        {
            if(i<=mid)
            {
                 for(int sp=1;sp<=mid-i;sp++)
                 {
                     System.out.print(" ");
                 }
                 
                 for(int j=1;j<=i;j++)
                 {
                     if(j==1)
                     {
                         System.out.print("*"); 
                     }
                     else
                     {
                          System.out.print(" ");
                     }
                 }
                 for(int j=1;j<i;j++)
                 {
                     if(j==i-1)
                     {
                         System.out.print("*");
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                 }
            }
           
            System.out.println();
        }
    }
      
    
}
