/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set64;

/**
 *
 * @author hp
 */
public class Set64_9 
{
    public static void main(String[] args)
    {
       int n=100;
       double value=0;
       double sum=0;
        for(int i=2;i<n;i++)
        {
            boolean flag=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
            System.out.print(i+" , ");
            value=(double)Math.pow(i,2);
            sum=sum+value;
            }
        }
        System.out.println("\nSum="+sum);
    }
    
}
