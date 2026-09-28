/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set59;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set59_2
{
    public static void main(String args[])
    {
        System.out.println("Enter the three sides of triangle");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+b)>b)
        {
            System.out.println("Triangle is Formed");
            if(a==b && b==c)
                System.out.println("The triangle is Equitrial");
            else if(a==b || b==c || c==a)
                System.out.println("The triangle is isoscale");
            else
                System.out.println("The Triangle is Scalene");
        }
        else
            System.out.println("Triangle is Not formed");
        
    }
    
}
