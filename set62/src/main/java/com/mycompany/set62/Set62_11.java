/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set62;

/**
 *
 * @author hp
 */
public class Set62_11
{
    public static void main(String[] args) 
    {
        int x=1;
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<5-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+"");
            }
            System.out.println();
            x=x+2;
        }
        
    }
    
}
