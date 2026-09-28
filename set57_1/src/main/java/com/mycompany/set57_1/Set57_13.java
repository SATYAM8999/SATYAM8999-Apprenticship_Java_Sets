/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set57_1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set57_13 
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
         int a=sc.nextInt();
         String result=(a%2==0)?"a is Even":"A is Odd";
          System.out.println(result);
    }
}
