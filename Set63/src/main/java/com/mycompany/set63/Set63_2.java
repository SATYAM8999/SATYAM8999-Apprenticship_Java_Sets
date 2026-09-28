/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_2 
{
    public static void main(String args[])
   {
       
       for(int i=1;i<=7;i++)
       {
           for(int j=1;j<=7;j++)
           {
             if(i==j || i+j==8)
               System.out.print("*");
             else
                   System.out.print(" ");
           }
           System.out.println();
       }
   }
    
}
