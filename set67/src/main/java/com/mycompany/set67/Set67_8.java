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
public class Set67_8
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
       System.out.println("Before Swapped Array Is");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" , ");
        }
        System.out.println("Enter Two Element for Swapping");
        int ele1=sc.nextInt();
        int ele2=sc.nextInt();
        int pos1=-1,pos2=-1;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele1)
                pos1=i;
            if(a[i]==ele2)
                pos2=i;
        }
        int temp=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=temp;
         System.out.println("Swapped Array Is");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" , ");
        }
        
    }
}
