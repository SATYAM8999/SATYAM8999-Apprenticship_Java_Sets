/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set57_1;

/**
 *
 * @author hp
 */
public class Set57_5
{
    public static void main(String args[])
    {
        int days=500;
        int  year=days/365;//1
        int r1=days%365;
        int month=r1/30;
        int r2=r1%30;
        int week=r2/7;
        int day=r2%7;
        System.out.println("Year="+year+"Month="+month +"Week:"+week+"Days:"+day);
    }
    
}
