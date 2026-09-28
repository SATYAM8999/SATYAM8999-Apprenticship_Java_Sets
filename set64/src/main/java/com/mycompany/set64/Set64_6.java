/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_6 
{
    public static void main(String args[])
    {
        int n=5;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;
               
            }
            sum=sum+fact;
        }
        System.out.println(sum);
    }
     
    
}
