/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set57_1;

/**
 *
 * @author hp
 */
public class Set57_7 
{
    public static void main(String args[])
    {
        int milimeters=5034;
        int meter=milimeters/1000;
        int r1=milimeters%1000;
        int feet=r1/300;
        int r2=r1%300;
        int inches=r2/25;
        int r3=r2%25;
        int centemeter=r3/10;
        int milimeter=r3%10;
        System.out.println("Meters="+meter+ "\tFeets="+feet+ "\tInches="+inches+ "\tcentemeter="+centemeter+ "\tMilimeter="+milimeter);
        
    }
    
}
