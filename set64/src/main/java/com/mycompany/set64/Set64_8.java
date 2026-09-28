/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_8 
{
    public static void main(String args[])
    {
      int n=10;
      int f1=0,f2=1,f3;
      double sum=0;
      for(int i=2;i<=n;i++)
      {
           f3=f1+f2;
           System.out.println(f3+" ");
           double value=1/Math.pow(f3,2);
           sum=sum+value;
           f1=f2;
           f2=f3;
          
      }
        System.out.println("\n Sum="+sum);
    }
    
}
