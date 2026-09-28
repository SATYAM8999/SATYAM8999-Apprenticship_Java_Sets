/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_1 
{
    
   public static void main(String args[])
   {
       //int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
       for(int i=1;i<=6;i++)
       {
           for(int j=1;j<=6;j++)
           {
             if(i==1 || i==6 || j==1 || j==6)
             {
               System.out.print("*");
             }
             else
             {
                 System.out.print(" ");
             }             
           }
             
           System.out.println();
       }
       
   }
    
}
