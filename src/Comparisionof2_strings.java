import java.util.Scanner;
public class Comparisionof2_strings {
public static void main(String args[])
{
    String str1,str2;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 2 strings");
 str1=sc.nextLine();
 str2=sc.nextLine();
 if(str1.equalsIgnoreCase(str2))
 {
 System.out.println("Strings are equal");
 }
else
 {
 System.out.println("Strings are not equal");
 }
}
}