//Write a program to create an object of an class which contain a method and call that class method in main method.

public class objectCall 
{
    public void message()
    {
        System.out.println("This message is from message method");
    }
    public static void main(String[] args) 
    {
        objectCall obj = new objectCall();
        obj.message();
       
    }    
}