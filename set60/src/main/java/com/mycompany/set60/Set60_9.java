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
public class Set60_9
{
      public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        
        for(int i=0;i<100;i++)
        {
          if(i%n!=0)
          {
              System.out.print(i+" , ");
          }
              
        }
    }  
}
