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
public class Set65_5
{
    public static void main(String args[])
    { 
    
        System.out.println("Enter the Principle amount");
        Scanner sc1=new Scanner(System.in);
        long principle_Amount=sc1.nextLong();
        
        System.out.println("Enter the rate of Intrest");
        Scanner sc2=new Scanner(System.in);
        double roi=sc2.nextDouble();
        
        System.out.println("Enter the year");
        Scanner sc3=new Scanner(System.in);
        int year=sc3.nextInt();
        
        int count=1;
        long double_principle_amount=2*principle_Amount;
        System.out.println("Double amount is "+double_principle_amount);
        
        while(principle_Amount<double_principle_amount)
        {
            long one_percent_amount=(long)((principle_Amount/100)*roi);
            principle_Amount=principle_Amount+one_percent_amount;
            System.out.println("the principle amount at year "+count+" is "+principle_Amount);
            count++;
            
        }
    }
    
}
