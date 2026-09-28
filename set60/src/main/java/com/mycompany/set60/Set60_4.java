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
public class Set60_4 
{
     public static void main(String[] args) 
    {
     
       Scanner sc=new Scanner(System.in);
       int choice;
        System.out.println("Enter your choice ");
        choice=sc.nextInt();
       
        switch(choice)
        {
            case 1: Scanner sc1=new Scanner(System.in);
                    System.out.println("Enter the Side of Square");
                    int side=sc1.nextInt();
                    int area=side*side;
                    System.out.println("Area of Square is"+area);
                     break;
            case 2:  Scanner sc2=new Scanner(System.in);
                     System.out.println("Enter the length and breadth of rectriangle");
                     int length=sc2.nextInt();
                     int breadth=sc2.nextInt();
                     int area1=length*breadth;
                     System.out.println("Area of Rectrangle is"+area1);
                     break;
            case 3:  Scanner sc3=new Scanner(System.in);
                     System.out.println("Enter the Readius of Circle");
                     int redius=sc3.nextInt();
                     float area2=(float)3.14*(redius*redius);
                     System.out.println("Area of Rectrangle is"+area2);
                     break;
            case 4:  Scanner sc4=new Scanner(System.in);
                     System.out.println("Enter the height and weight of trianle");
                     int height=sc4.nextInt();
                      int width=sc4.nextInt();
                     float area3=(float)0.5*(height*width);
                     System.out.println("Area of Rectrangle is"+area3);
                     break;
            default:
                   System.out.println("invalid choice please enter correct choice");
                   break;
        }
    }
     
    
}
