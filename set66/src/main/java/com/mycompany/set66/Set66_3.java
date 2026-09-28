/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set66;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Set66_3
{
     public static void main(String[] args)
    {
       
        Scanner sc1=new Scanner(System.in);
        int cont;
        do
        {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the color alphabet");
            String ch=sc.nextLine();
            char color=ch.charAt(0);
            switch(color)
            {
                case 'r':System.out.println("RED");
                         break;
                case 'o':System.out.println("ORANGE");
                        break;
                        
                case 'y':System.out.println("YELLOW");
                        break;
                case 'g':System.out.println("GREEN");
                        break;
                case 'b':System.out.println("BLUE");
                        break; 
                case 'i':System.out.println("INDIGO");
                        break;
                case 'v':System.out.println("VOILET");
                        break;
                default:System.out.println("YOu have enter Wrong choice please enter correct choice");
                        break;
                   
            }
            System.out.println("Do You Want To continue.If Yes Press 1 otherwise press 0");
            cont=sc.nextInt();
        }while(cont==1);
        
        
    }
    
}
