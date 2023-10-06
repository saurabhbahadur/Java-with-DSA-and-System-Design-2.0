// 1.Write a java program to Reverse a string without using the inbuilt method.

public class revStr {
    public static void main(String[] args) {
        String name = "Saurabh Bahadur";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) 
        {

            char letter = name.charAt(i);
            reverse = reverse + letter;
        }
        System.out.println(reverse);
    }
}