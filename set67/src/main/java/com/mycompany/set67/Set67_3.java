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
public class Set67_3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array Is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" , ");
        }
        int ecount=0,ocount=0;
        for(int num:a)
        {
            if(num%2==0)
            {
                ecount++;
            }
            if(num%2==1)
                ocount++;
        }
       int evenArray[]=new int[ecount];
       int oddArray[]=new int[ocount];
       int p=0,q=0;
       for(int i=0;i<a.length;i++)
       {
         if(a[i]%2==0)
         {
             evenArray[p++]=a[i];
         }
         if(a[i]%2==1)
         {
             oddArray[q++]=a[i];
         }
       }
        System.out.println("Even Array is:");
        for(int i=0;i<ecount;i++)
        {
            System.out.print(evenArray[i]+" , ");
        }
        System.out.println("\nOdd Array is:");
        for(int i=0;i<ocount;i++)
        {
            System.out.print(oddArray[i]+" , ");
        }
    }
    
}
