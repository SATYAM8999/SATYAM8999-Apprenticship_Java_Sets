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
public class Set66_10
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
        int even=0,odd=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even=even+1;
            }
            if(a[i]%2==1)
            {
               odd=odd+1; 
            }
        }
        System.out.println("Even Element Count is:"+even);
        System.out.println("Odd Element Count is:"+odd);
    }
}
