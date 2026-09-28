/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set60;

/**
 *
 * @author hp
 */
public class Set61_11
{
     public static void main(String[] args)
    {
        int n=5;
        for(int i=n;i>0;i--)
        {
            for(int sp=0;sp<n-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
