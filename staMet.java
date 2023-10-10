//4.Write a program to call a method without creating an object of a class?

class free
{
    static void disp()
    {
        System.out.println("This is static method");
    }
}

public class staMet 
{
    public static void main(String[] args) {
        free.disp();
    }    
}
