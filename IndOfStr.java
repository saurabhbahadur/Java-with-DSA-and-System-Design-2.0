//5.Write a java program to find the index of a substring.
import java.util.*;
public class IndOfStr 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        System.out.println("Enter the string to find in main String");
        String str2 = sc.nextLine();
        int idx = str1.indexOf(str2);
        if (idx==-1)
        {
            System.out.println("String not found");
        }
        else
        {
            System.out.println("String found");
        }
        sc.close();
    }
}
