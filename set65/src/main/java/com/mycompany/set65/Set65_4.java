/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set65;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set65_4
{
    public static void main(String args[])
    {
     
      
     
        System.out.println("Enter the population of country");
        Scanner sc1=new Scanner(System.in);
        long population=sc1.nextLong();
        
        System.out.println("Enter the rate of population of country");
        Scanner sc2=new Scanner(System.in);
        double roy=sc2.nextDouble();
        
        System.out.println("Enter the year");
        Scanner sc3=new Scanner(System.in);
        int year=sc3.nextInt();
        
        int count=1;
        
        while(count<=year)//y=4
        {
            long one_percent_population=(long)((population/100)*roy);
            population=population+one_percent_population;
            System.out.println("population of country at year "+count+" is "+population+" crore");
            count++;
        }
        
        
        
        
    }
    
}
