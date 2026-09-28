/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_4 
{
    public static void main(String args[])
    {
        int n=10;
        int x=2;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
           // System.out.println(x);
            double value=(double)1/Math.pow(x, 2);
            sum=sum+value;
            
            x=x+2;
        }
        System.out.println("Sum="+sum);
        
    }
}
