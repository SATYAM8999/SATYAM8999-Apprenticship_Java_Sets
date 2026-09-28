/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_5 
{
    public static void main(String args[])
    {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
           int value=(int)Math.pow(3, i);
           sum=sum+value;
        }
        System.out.println("Sum="+sum);
    }
    
}
