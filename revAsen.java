//3. WAP to reverse a sentence while preserving the position
public class revAsen {
    public static void main(String[] args) {
        String str1 = "My name is Saurabh";
        String str2 = "";
        String sarr[] = str1.split(str2);

        for (String elem : sarr)
        {
            System.out.println(elem);
        }

        for (String elem : sarr) 
        {
            for (int i = elem.length() - 1; i >= 0; i--) 
            {
                str2 = str2 + elem.charAt(i);
            }
            str2=str2 +"";
        }

        System.out.println(str2);
    }
}
