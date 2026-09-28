/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set57_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set57_12 
{
     public static void main(String args[])
     {
       
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         double numerator=(double)(-b)+sqrt((b*b)-4*a*c);
         double denominator=2*a;
         
         double result=numerator/denominator;
         System.out.println("REsult is"+result);
         
         
     }
    
    
}
