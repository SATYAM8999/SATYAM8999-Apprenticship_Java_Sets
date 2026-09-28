/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set65;

/**
 *
 * @author hp
 */
public class Set65_6
{
    public static void main(String args[])
    {
        int n=100,i=2;
        
        while(i<=n)
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
            {
                System.out.print(i+" , ");
            }
            i++;
        }
    }
}
