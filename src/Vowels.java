import java.util.Scanner;
public class Vowels {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String name;
        int l;
        char ch;
        int count =0;
        name = sc.nextLine();
        for(int i =0;i<name.length();i++)
        {
            ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("The Total no. Vowel " + count);
               
    }
}
