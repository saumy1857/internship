

import java.util.Scanner;
 
public class Shortform
{
   
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        
        String name;
        
        System.out.println("Enter ur full name....");
        
        
          name = sc.nextLine(); 
          
          System.out.print(name.charAt(0)+".");
        
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==' ') 
               System.out.print(name.charAt(i+1)+"."); 
                
        }
    }
}
            
       
        
        
    
    

