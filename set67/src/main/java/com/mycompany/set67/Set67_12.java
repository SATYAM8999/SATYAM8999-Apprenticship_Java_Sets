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
public class Set67_12 
{
   public static void main(String args[])
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

        System.out.println("Array Elements Are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }
        int count=0;

        for(int i=0;i<a.length;i++)
        {
            int num = a[i];
            boolean flag = true;

            for(int j=2; j<=num/2; j++)
            {
              if(num%j==0)
              {
                    flag=false;
                    break;
              }
           }
          if(flag)
          {
              count++;
          }
        }

        System.out.print("\nPrime Numbers Count is: " + count);
    }
}
