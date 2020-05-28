
import java.util.Scanner;

public class Lexicographic
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter 2 string");
       int r;
       String name,name1;
       name = sc.nextLine();
       name1 = sc.nextLine();
       r = name.compareToIgnoreCase(name1);
       if(r == 0)
       {
           System.out.println("Same string");
       }
       else 
       {
           System.out.println(r);
       }
        
    }
}

