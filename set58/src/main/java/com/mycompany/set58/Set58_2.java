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
public class Set58_2 
{
     public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Three numbers");
    int x=sc.nextInt();
    int y=sc.nextInt();
    String result=(x>0 && y>0)?"First Quadrant":(x<0 && y>0)?"Second Quadrant":(x<0 && y<0)?"Third Quadrant":(x>0 && y<0)?"Fourth quadrant":(x>0 && y==0)?"Positive x Axis":(x==0 && y>0)?"positive y Axis":(x<0 && y==0)?"Negative x axis":(x==0 && y<0)?"negative y axis":"Origin";
       System.out.println(result);
   }
}
