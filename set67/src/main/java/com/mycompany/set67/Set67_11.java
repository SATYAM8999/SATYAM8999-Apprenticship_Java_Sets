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
public class Set67_11
{   public static void main(String[] args) 
    {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" Array Elements Is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(" After  Sorting array Elements Is");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }

    
}
