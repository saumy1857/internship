import java.util.Scanner;
       
public class Case {
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     String name,name1="";
     char ch1;
    System.out.println("Enten any word");
    name=sc.nextLine();
    for(int i=0;i<name.length();i++)
    { char ch=name.charAt(i);
        if(Character.isUpperCase(ch))
        {
               ch1 =   Character.toLowerCase(ch);
        }
        else
        {
               ch1 =   Character.toUpperCase(ch);
        }
         name1 = name1 + ch1;
    }
    
    System.out.println(name1);
    
    
             
    
}
}
