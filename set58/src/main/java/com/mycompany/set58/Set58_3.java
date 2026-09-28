/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set58;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set58_3 
{
    public static void main(String args[])
    {
        System.out.println("Enter the coefficient of quadratic equations");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int discreminant=(b*b)-(4*a*c);
        System.out.println("");
        String res=(discreminant>0)?"Roots are real":(discreminant<0)?"roots are imagenory":"roots are equals";
        System.out.println(res);
        
    }
    
}
