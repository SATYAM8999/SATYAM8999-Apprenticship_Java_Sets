/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_9
{
   public static void main(String args[])
   {
       int k=-1;
       for(int i=5;i>=1;i--)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j);
           }
          for(int sp=1;sp<=k;sp++)
          {
              System.out.print(" ");
              
          }
          int x=(i==5)?4:i;
          for(int j=x;j>=1;j--)
           {
               System.out.print(j);
           }
            k+=2;

          System.out.println();
                   
           
       }
   }
    
}
