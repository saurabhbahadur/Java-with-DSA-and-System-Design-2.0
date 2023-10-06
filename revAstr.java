//WAP to reverse a String
public class revAstr {
    public static void main(String[] args) {
        String name = "Saurabh Bahadur";
        String rev = reverseString(name);
        System.out.println("The original string is: " + name);
        System.out.println("The reversed string is: " + rev);
    }

    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }
}
