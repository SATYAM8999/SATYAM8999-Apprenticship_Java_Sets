/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_11      
{
    public static void main(String args[])
    {
        int n=10;
        int sum=0;
        int sign=1;  
        double addition=0;
        for(int i=1;i<=n;i++)
        {
            //System.out.println(sign);
            sum=sum+i;
            System.out.println(sum);
            double value=(double)sign/sum;
            addition=addition+value;
            sign=-sign;
        }
        System.out.println("Sum="+addition);
    }
    
    
}
