//  Write a program to demonstrate method overloading with 3 different parameters.
import java.util.*;
class Sum
{
   public int add(int a , int b)
    {
      return a+b;
    }

    public int add(int a , int b , int c)
    {
        return a+b+c;
    }
}

class methodOverloading
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum sum = new Sum();
        int c = sum.add(a,b);
        int d = sum.add(a,b,c);
        System.out.println( "a+b= c:" +c);
        System.out.println("a + b + c = d:" +d);
        System.out.println("Metod Overloading");
        sc.close();
    }
}