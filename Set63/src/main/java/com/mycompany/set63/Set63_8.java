/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_8
{  public static void main(String args[])
   {
       for(int i=1;i<=5;i++)
       {
           for(int sp=1;sp<i;sp++)
           {
               System.out.print(" ");
           }
          for(int j=i;j<=5;j++)
          {
              System.out.print(j);
          }
          for(int k=5-i;k>=1;k--)
          {
              System.out.print(k);
          }
         
           System.out.println();
       }
   }
    
    
}
