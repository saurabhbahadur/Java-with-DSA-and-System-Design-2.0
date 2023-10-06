
//3.Write a java program to convert upper case to lower case and vice versa.
import java.util.*;

public class ULCasStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        System.out.println("Your enter String is :" +str);
        String str2 = "";
        for(int i = 0; i< str.length(); i++)
        {
            if(str.charAt(i)>= 'a' && str.charAt(i)<='z')
            {
                str2 = str2 + (char) (str.charAt(i) - 32);
            }
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                str2 = str2 + (char) (str.charAt(i) + 32);
            }
        }

         System.out.println("The final output of the string :" +str2);

        sc.close();
    }
}
