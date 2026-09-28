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
public class Set66_13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size=sc.nextInt();
        System.out.println("Enter the Array Elements");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.println("The Array Elements are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }
        int positive=0,negative=0,zero=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                positive=positive+1;
            }
            else if(a[i]<0)
            {
                negative=negative+1;
            }
            else
                zero=zero+1;
        }
        System.out.println("\nPositive Numbers count is:"+positive);
        System.out.println("Negative Numbers count is:"+negative);
        System.out.println("Zero Numbers count is:"+zero);
    }
}
