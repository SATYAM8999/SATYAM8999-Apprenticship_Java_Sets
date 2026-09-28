/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set66;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set66_2
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Two Numbers");
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int cont;
       do
       {
          System.out.println("Enter the Choice");
          int choice=sc.nextInt();
          
          switch(choice)
          {
              case 1:int sum=num1+num2;
                     System.out.println("Addition="+sum);
                     break;
              case 2:int diff=num1-num2;
                         System.out.println("Subtraction="+diff);
                         break;
              case 3:int mul=num1*num2;
                         System.out.println("Multiplication="+mul);
                         break;
              case 4:double div=(double)num1/num2;
                     System.out.println("Division="+div);
                     break;
              case 5:int rem=num1%num2;
                     System.out.println("Reminder="+rem);
                     break;
              default:System.out.println("You Have Enter Wrong Choice.Please Enter Correct Choice !!!");
                      break;
          }
           System.out.println("Do You Want to Continue.If yes press 1 othewise press 0");
           cont=sc.nextInt();
       }while(cont==1);
       
        
    }
    
}
