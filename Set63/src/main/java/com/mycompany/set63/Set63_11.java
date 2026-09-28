/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_11 
{
     public static void main(String args[])
   {
       int sp=7;
       for(int i=5;i>=1;i--)
       {
           for(int j=5;j>=i;j--)
           {
               System.out.print(j);
           }
           for(int k=1;k<=sp;k++)
           {
               System.out.print(" ");
           }
           
           for(int j=i;j<=5;j++)
           {
               System.out.print(j);
           }
           sp=sp-2;
           
           System.out.println();
       }
   }
    
}
