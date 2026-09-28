/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set60;

/**
 *
 * @author hp
 */
public class Set60_13
{
    
    public static void main(String args[])
    {
  
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n=sc.nextInt();
       
        int n=14;
        int count=0;
        for(int i=2;i>=2;i++)
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
               count++;
            }
            if(count==n)
            break; 
           
         
           
        }
    }
    
}
