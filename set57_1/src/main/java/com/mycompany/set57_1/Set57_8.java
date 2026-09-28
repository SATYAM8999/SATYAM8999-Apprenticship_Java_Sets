/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set57_1;

/**
 *
 * @author hp
 */
public class Set57_8
{
     public static void main(String args[])
     {
         int x1=1,x2=2,x3=3,x4=4,x5=5;
         double mean=(double)(x1+x2+x3+x4+x5)/5;
         System.out.println("MEan="+mean);
         double veriance=Math.sqrt((double)Math.pow(x1-mean, 2)+Math.pow(x2-mean, 2)+Math.pow(x3-mean,2)+Math.pow(x4-mean,2)+Math.pow(x5-mean,2));
         //double sd=(double)Math.sqrt(veriance);
         System.out.println("Standard Deviation="+veriance);
     }
    
}
