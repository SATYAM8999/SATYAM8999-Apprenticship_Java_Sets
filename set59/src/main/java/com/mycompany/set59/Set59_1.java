/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set59;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set59_1 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the Character");
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        char fc=ch.charAt(0);
        int ascii=(int)fc;
        String res;
        if(ascii>=65 && ascii<=90)
            res="UPPER CASE";
        else if(ascii>=97 && ascii<=122)
            res="LOWER CASE";
        else if(ascii>=48 && ascii<=57)
            res="DIGITS";
        else
            res="OTHER";
        System.out.println("The give character is in "+res);
    }
    
}
