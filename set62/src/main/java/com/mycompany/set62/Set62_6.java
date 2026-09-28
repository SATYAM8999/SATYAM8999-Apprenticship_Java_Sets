/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set62;

/**
 *
 * @author hp
 */
public class Set62_6 
{
    public static void main(String[] args) 
    {  
//     for(int i=5;i>=1;i--)
//        {
//            for(int sp=1;sp<=5-i;sp++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j+"");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
