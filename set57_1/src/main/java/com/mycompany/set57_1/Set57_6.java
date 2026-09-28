/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set57_1;

/**
 *
 * @author hp
 */
public class Set57_6 
{
    public static void main(String args[])
    {
        int seconds=5000;
        int hours=seconds/3600;
        int r1=seconds%3600;
        int minutes=r1/60;
        int second=r1%60;
        System.out.println("Hours="+hours+ "Minutes="+minutes+ "Seconds="+second);
        
    }
    
}
