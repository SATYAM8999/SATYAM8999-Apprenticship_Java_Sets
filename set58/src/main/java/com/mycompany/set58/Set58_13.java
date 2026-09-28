/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set58;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set58_13
{
        public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        String c=sc.nextLine();
        char ch=c.charAt(0);
        System.out.println(ch);
        
//        int ascii=(int)ch;
//        System.out.println("Ascii is "+ascii);
        
        if(ch>65 && ch<=90)
            System.out.println(ch+"is in Upper case");
        else if(ch>=97 && ch<=120)
            System.out.println(ch+" is in Lower case");
      
        
    }
    
}
