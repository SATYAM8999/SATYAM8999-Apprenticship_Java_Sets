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
public class Set58_8
{
     public static void main(String args[])
    {
        System.out.println("Enter the value of A and b");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("(a>b && a>c)"+((a>b)&&(a>c)));
        System.out.println("(a<b)|| b>=a  "+((b<d) && (b>=a)));
        
        System.out.println("(c!=d) "+(c!=d));
       
         
        

    
            
       
    }
    
}
