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
public class Set59_3
{ 
    public static void main(String args[])
    {
        System.out.println("Enter three numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b)==c)
            System.out.println("The numbers is the part of Fibonacci series");
        else
            System.out.println("The numbers is not a part of Fibonacci Series");
    }
    
}
