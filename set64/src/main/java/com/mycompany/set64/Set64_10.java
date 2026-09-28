/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_10
{
    public static void main(String args[])
    {
        int n=12;
        int sign=1;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            int x=i*sign;
            //System.out.println(x);
            double value=(double)1/x;
            sum=sum+value;
            sign=-sign;
           
        }
        System.out.println("Sum="+sum);
        
        
    }
    
}
