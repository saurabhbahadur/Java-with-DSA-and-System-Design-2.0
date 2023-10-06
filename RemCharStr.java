//4.Write a java program to remove a particular character from a String.

import java.util.*;

public class RemCharStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println("Enter the index value you want to remove from string ");
        int idx = sc.nextInt();

        String sf = str.substring(0, idx) + str.substring( idx +1);
        System.out.println("The final string is ::"+sf);
        System.out.println("The final String is :" + removeCharAt(str, idx));
        sc.close();
    }

    public static String removeCharAt(String s, int idx) {
        return s.substring(0, idx) + s.substring(idx + 1);
    }
}
