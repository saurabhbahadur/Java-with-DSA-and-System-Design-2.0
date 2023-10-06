//2.Write a java program to know whether the given string is palindrome

import java.util.Scanner;

public class palinStr {
    public static void main(String[] args) 
    {
        String str , rev = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check it is palindrone or not");
        str = sc.nextLine();
        
        for(int i = str.length()-1; i>=0 ;i-- )
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        
        if(str.equals(rev))
        {
            System.out.println("String is palindrone");
        }
        else
        {
            System.out.println("String is not palindrone");
        }
        sc.close();
    }

}
