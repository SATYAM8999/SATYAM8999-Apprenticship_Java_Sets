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
public class Set60_10 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<num;i++)
        {
                if(num%i==0)
                {
                    flag=false;
                    break;
                }
        }
        if(flag)
             System.out.println(num+" is Prime");
        else
            System.out.println(num+" is Not Prime");
      
    }  
    
}
