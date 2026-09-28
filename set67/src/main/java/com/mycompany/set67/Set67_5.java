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
public class Set67_5
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
        int element;
    
        System.out.println("Enter the Element That we want to search");
        element=sc.nextInt();
        int pos= -1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==element)
            {
                pos=i;
                break;
            }
              //System.out.println(pos);
        }
        System.out.println(pos);
        if(pos==-1)
            System.out.println("Element Are Not found in Given Array");
        else
            System.out.println("Element "+element+" are Found at position :"+pos);
       
        
    }
    
}
