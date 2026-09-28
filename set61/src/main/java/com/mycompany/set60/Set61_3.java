/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set60;

/**
 *
 * @author hp
 */
public class Set61_3
{
      public static void main(String[] args)
    {
     
        int f0=0,f1=1,f2=1,f3;
        int n=10;
        for(int i=2;i<=n;i++)
        {
            f3=f0+f1+f2;
            System.out.print(f3+" , ");
            f0=f1;
            f1=f2;
            f2=f3;
            
        }
        
    }
    
}
