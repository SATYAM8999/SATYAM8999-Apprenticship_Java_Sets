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
public class Set60_1 
{
    
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Three Numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       
       
       switch((a>b && a>c)?0:(b>a && b>c)?1:2)
       {
           case 0:System.out.println(a+" is Greatest");
                 break;
           case 1:System.out.println(b+" is Greatest");
                  break;
           case 2:System.out.println(c+" is Greatest");
                  break;
       }
       
    }
    
}
