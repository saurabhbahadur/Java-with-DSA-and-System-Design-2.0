//5.Write a program which has static block and constructor overloading,initialise variables using constructors and print it.

class combo
{
    private String name;
    private int id;

    combo(){
        System.out.println("default constructor");
    }
    combo(String name , int id){
            this.name= name;
            this.id = id;
    }

    void disp()
    {
        System.out.println(name);
        System.out.println(id);
    }
    static
    {
        System.out.println("This is static block");
    }
}

public class conSta 
{
    public static void main(String[] args)
    {
        combo con1 = new combo();
        combo con = new combo("Saurabh" , 23);
        con.disp();
    }    

}
