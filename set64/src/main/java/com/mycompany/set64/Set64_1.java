/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_1 
{
    
    public static void main(String args[])
    {
        int n=7;
        int mid=n/2+1;
        int x=mid-1;
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
                  System.out.print("*");
              }
              for(int j=1;j<i;j++)
              {
                  System.out.print("*");
              }
          }
          else
          {
              for(int sp=1;sp<=mid-x;sp++)
              {
                  System.out.print(" ");
              }
              for(int j=1;j<=x;j++)
              {
                  System.out.print("*");
              }
               for(int j=1;j<x;j++)
              {
                  System.out.print("*");
              }
              x--;
              
          }
          System.out.println();
          
        }
        
    }
    
}
