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
public class Set58_1 
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Three numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   String res=(a>b && a>c)?"A is Greatest":(b>a && b>c)?"B is greatest":"C is greatest";
       System.out.println(res);
   }
    
}
