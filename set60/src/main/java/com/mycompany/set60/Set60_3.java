/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set60;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set60_3 
{
     public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the two Numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       Scanner sc1=new Scanner(System.in);
       String ch;
        System.out.println("Enter your choice ");
        ch=sc1.nextLine();
        char choice=ch.charAt(0);
        switch(choice)
        {
            case '+':int sum=a+b;
                     System.out.println("Addition is"+sum);
                     break;
            case '-':int diff=a-b;
                     System.out.println("Subtraction is"+diff);
                     break;
            case '*':int mul=a*b;
                     System.out.println("Multiplication is"+mul);
                     break;
            case '/':float div=(float)a/b;
                     System.out.println("Division is"+div);
                     break;
            case '%':int reminder=a%b;
                     System.out.println("Reminder is"+reminder);
                     break;
            default:
                   System.out.println("invalid choice please enter correct choice");
                   break;
        }
    }
                
    
}
