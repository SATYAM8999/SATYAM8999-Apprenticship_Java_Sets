/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set60;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set60_8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int f1=-1,f2=1,f3;
        for(int i=0;i<n;i++)
        {
            f3=f1+f2;
            System.out.println(f3+" , ");
            f1=f2;
            f2=f3;
        }
    }   
  
}
