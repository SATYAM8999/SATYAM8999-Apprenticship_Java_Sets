/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set65;

import java.util.Scanner;


public class Set65_9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int binary=0,base=1;
        while(num>0)
        {
            int rem=num%2;
            binary=binary+rem*base;
            num=num/2;
            base=base*10;
        }
        System.out.println("Binary Equivalent of given Number:"+binary);
    }
    
}
