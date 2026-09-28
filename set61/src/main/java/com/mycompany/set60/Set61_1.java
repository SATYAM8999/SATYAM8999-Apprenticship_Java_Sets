/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set60;

/**
 *
 * @author hp
 */
public class Set61_1 
{
    public static void main(String[] args)
    {
        int start=(int) System.currentTimeMillis();
        int n=100;
       
        for(int i=2;i<n;i++)
        {
            boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            System.out.print(i+" , ");
        }
       int end=(int) System.currentTimeMillis();
       int time=end-start;
        System.out.println("\n\ntime taken for execution: "+(time));
       
    }
    
}
