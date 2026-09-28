/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_6 
{
    public static void main(String args[])
   {
     int sp=7;
     for(int i=1;i<=5;i++)
     {
         for(int j=1;j<=i;j++)
           System.out.print(j);
       
         for(int k=1;k<=sp;k++)
          System.out.print(" ");
       
         int x=(i==5)?4:i;
         for(int j=x;j>=1;j--)
         System.out.print(j);
    
         sp=sp-2;
         
         System.out.println();
     }
   }
    
}
