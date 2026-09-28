/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set65;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class set65_8 
{
    public static void main(String args[])
    {
        System.out.println("Enter the Number for reversing a given number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("reverse Number is "+rev);
    }
    
}
