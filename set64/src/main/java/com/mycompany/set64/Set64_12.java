/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

public class Set64_12 
{
    public static void main(String args[])
    {
        int n=12;
        int sign=1;
        double sum=0;
        int f1=0,f2=1,f3;
        for(int i=1;i<=n;i++)
        {
            f3=f1+f2;
            System.out.println(f3+" ");
            int x=2*sign;
            double value=(double)x/f3;
            sum=sum+value;
            f1=f2;
            f2=f3;
           
           // System.out.println(x);
           sign=-sign;
           
        }
       
        
        
    }
    
}
