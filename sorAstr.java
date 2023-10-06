// WAP to sort a String Alphabetically

import java.util.Arrays;

public class sorAstr {
    static void sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }

    public static void main(String[] args) {
        String s = "qwertyuiopasdfghjklzxcvbnm";
        sortString(s);
    }
}
