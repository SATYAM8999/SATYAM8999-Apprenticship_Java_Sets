/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set66;

/**
 *
 * @author hp
 */
public class Set66_4
{
    public static void main(String args[])
    {
        int n=10;
        int i=1;
        double sum=0;
        do
        {
            System.out.println(i+"  ");
            
            double value=(double)1/i;
            sum=sum+value;
            i++;
        }while(i<=n);
        System.out.println("\nSum="+sum);
    }
    
}
