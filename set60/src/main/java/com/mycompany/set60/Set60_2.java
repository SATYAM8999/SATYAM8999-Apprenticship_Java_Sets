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
public class Set60_2
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the two Numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
     
       
       int ch;
        System.out.println("Enter your choice ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:int sum=a+b;
                   System.out.println("Addition is"+sum);
                   break;
            case 2:int diff=a-b;
                  System.out.println("Subtraction is"+diff);
                  break;
            case 3:int mul=a*b;
                   System.out.println("Multiplication is"+mul);
                   break;
            case 4:float div=(float)a/b;
                   System.out.println("Division is"+div);
                   break;
            case 5:int reminder=a%b;
                   System.out.println("Reminder is"+reminder);
                   break;
            default:
                   System.out.println("invalid choice please enter correct choice");
                   break;
        }
                
        
       
      
    }
 
}
