/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_3 
{
     public static void main(String args[])
   {
       int f1=-1,f2=1,f3;
       for(int i=1;i<=4;i++)
       {
           for(int j=1;j<=i;j++)
           {
               f3=f1+f2;
               System.out.print(f3+" ");
               f1=f2;
               f2=f3;
           }
           System.out.println();
       }
   }
    
}
