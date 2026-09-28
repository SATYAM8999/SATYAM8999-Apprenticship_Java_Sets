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
public class Set67_4 
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
        int sum=0;
        for(int num:a)
        {
            sum=sum+num;
        }
        double mean=(double)sum/a.length;
        System.out.println("Mean="+mean);
        double variance=0;
        for(int num:a)
        {
            variance=variance+Math.pow((num-mean),2);
            
        }
        variance=variance/a.length;
        double sd=Math.sqrt(variance);
        System.out.println("\nStandard Deviation="+sd);
    }
    
}
