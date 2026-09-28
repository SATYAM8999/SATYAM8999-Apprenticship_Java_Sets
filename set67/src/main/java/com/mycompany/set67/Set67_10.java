/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set67;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set67_10 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size=sc.nextInt();
        System.out.println("Enter the Array Element");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elemnt are");
         for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" , ");
        }
        System.out.println("Common elements in array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]+" , ");
                }
                
            }
        }
        
        
    }
    
}
