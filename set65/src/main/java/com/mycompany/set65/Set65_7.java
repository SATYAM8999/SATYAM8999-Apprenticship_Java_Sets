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
public class Set65_7
{
     public static void main(String args[])
    {
        System.out.println("Enter the Number for finding the GCD");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        
        int rem=x%y;
        while(rem!=0)
        {
            x=y;
            y=rem;
            rem=x%y;
        }
        System.out.println("GCD of Two number is "+y);
        
    }
    
    
}
