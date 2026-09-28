
package com.mycompany.set60;

public class Set61_2 
{
    public static void main(String[] args)
    {
        
        int n=100;
        int sum=0;
        for(int i=2;i<n;i++)
        {
            boolean flag=true;
            for(int j=2;j<i/2;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                }
            }
            if(flag==true)
                sum=sum+i;
            
        }
        System.out.print("Sum of Prime numbers is: "+sum);
    }
      
    
}
