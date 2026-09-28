/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_5
{
    public static void main(String args[])
   {
     for(int i=1;i<=5;i++)
     {
         for(int sp=1;sp<=5-i;sp++)
         {
             System.out.print(" ");
         }
         int x=i;
         for(int j=1;j<=i;j++)
         {
             System.out.print((x++));
         }
         x=x-2;
         
         for(int j=1;j<x;j++)
         {
             System.out.print((x--));
         }
         System.out.println();
     }
   }
    
}
