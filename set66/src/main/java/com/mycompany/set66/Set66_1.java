/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set66;

/**
 *
 * @author hp
 */
public class Set66_1 
{
    public static void main(String[] args)
    {
        int n=10;
        int f1=-1,f2=1,f3;
        int i=1;
        do
        {
            f3=f1+f2;
            System.out.println(f3+" ");
            f1=f2;
            f2=f3;
            i++;
        }while(i<=n);
     
    }
    
}
