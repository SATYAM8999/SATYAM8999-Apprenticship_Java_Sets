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
public class Set58_9 
{
      public static void main(String args[])
      {
        System.out.println("Enter the value of A and b");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("(a&b) ="+(a&b));
        System.out.println("(a|b) ="+(a|b));
        System.out.println("(a<<2)="+(a<<2));
        System.out.println("(a>>1)="+(b>>1));
        System.out.println("(a^b) ="+(a^b));
        System.out.println("~a    ="+~a);
        
         
      }
}
