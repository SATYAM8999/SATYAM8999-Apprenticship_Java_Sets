/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set67;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set67_9
{
    public static void main(String args[])
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
            System.out.print(a[i]+" , ");
        }
        
        int big=a[0];
        int small=a[0];
       int p= 0,q= 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>big)
            {
                big=a[i];
                p=i;
            }
            if(a[i]<small)
            {
                small=a[i];
                q = i;
            }
        }
       
        System.out.println("\nPos1"+p);
        System.out.println("Pos2="+q);
        if(p!=-1&& q!=-1)
        {
            int temp=a[p];
            a[p]=a[q];
            a[q]=temp;
        }
        System.out.println("After Swappjng Array ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
    
}

