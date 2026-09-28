/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set57_1;

/**
 *
 * @author hp
 */
public class Set57_10 
{
     public static void main(String args[])
    {
        int a=10,b=6,c=8;
        double s=(double)(a+b+c)/2;
        System.out.println("S="+s);
        double area=(double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is:"+area);
    }
    
}
