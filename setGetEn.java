//3.Use a private keyword for a variable and use setter and getter methods to initialise and print the values.

import java.util.Scanner;

class encap
{
     private int id;

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
}
public class setGetEn 
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id ");
        int a = sc.nextInt();
        
        encap obj = new encap();
        obj.setId(a);
        System.out.println("The User Entered id is:" +obj.getId());
        sc.close();    
    }    
}
