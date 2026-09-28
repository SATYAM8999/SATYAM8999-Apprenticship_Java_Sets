/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set65;

/**
 *
 * @author hp
 */
public class Set65_3
{
    public static void main(String args[])
    {
        int num=4567;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of Digits of a Given Number is:"+sum);
    }
    
}
