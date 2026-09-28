/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set63;

/**
 *
 * @author hp
 */
public class Set63_4 
{
    public static void main(String[] args)
    {
        
        int n=8,x=2;
        for (int i = 1; i <=n; i++) 
        {
            for (int j = 1; j <=i; j++)
            {
                for (int k = x; k>=1; k++)
                {
                    boolean flag=true;
                    for (int l = 2; l<=k/2; l++)
                    {
                     if(k%l==0)
                     {
                         flag=false;
                         break;
                     }
                    }
                    
                    if(flag)
                    {
                        System.out.print(k+"  ");
                        x=k+1;
                        break;
                    }
                    
                }
            }
            System.out.println("");
        }
       
       
    }
   
 
    
}
