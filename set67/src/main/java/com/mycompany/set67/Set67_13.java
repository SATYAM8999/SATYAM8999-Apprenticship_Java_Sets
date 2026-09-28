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
public class Set67_13
{
    
    public static void main(String[] args) 
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
        int fs=size/2;
        int ss=size-fs;
        int p=0,q=0;
       int fristArray[]=new int[fs];
       int secondArray[]=new int[ss];
       for(int i=0;i<a.length;i++)
       {
           if(i<fs)
           {
               fristArray[p++]=a[i];
               
           }
           else
               secondArray[q++]=a[i];
       }
        System.out.println("\nFirst Array Is");
        for(int i=0;i<fristArray.length;i++)
        {
            System.out.print(fristArray[i]+" , ");
        }
        System.out.println("\nSecond Array Is");
        for(int i=0;i<secondArray.length;i++)
        {
            System.out.print(secondArray[i]+" , ");
        }
        
    }
    
}
