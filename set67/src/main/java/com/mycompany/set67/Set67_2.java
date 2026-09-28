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
public class Set67_2 
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
        int esum=0,osum=0;
        for(int num:a)
        {
            if(num%2==0)
                esum=esum+num;
            else
                osum=osum+num;
        }
        System.out.println("Even Sum="+esum);
        System.out.println("Odd Sum="+osum);
    }
}
