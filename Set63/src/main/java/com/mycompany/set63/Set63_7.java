/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_7
{
    
   public static void main(String args[])
   {
    for(int i=5;i>=1;i--)
    {
        for(int sp=1;sp<=5-i;sp++)
        {
            System.out.print(" ");
        }
       for(int j=i;j>=1;j--)
       {
           System.out.print(j);
       }
       for(int j=2;j<=i;j++)
        System.out.print(j);   
        
       System.out.println();
    }
   }
}
