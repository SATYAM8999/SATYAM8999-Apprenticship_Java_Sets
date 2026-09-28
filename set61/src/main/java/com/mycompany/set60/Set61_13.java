/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set60;

/**
 *
 * @author hp
 */
public class Set61_13 
{
     public static void main(String args[])
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(j==0 || j==5 || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
             System.out.println();
            
        }
    }
    
}
