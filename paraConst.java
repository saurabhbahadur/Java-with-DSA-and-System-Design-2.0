
class constu
{
    private String name;
    private int id;

    constu(){
        System.out.println("default constructor");
    }
    constu(String name , int id){
            this.name= name;
            this.id = id;
    }

    void disp()
    {
        System.out.println(name);
        System.out.println(id);
    }
}
public class paraConst 
{
    public static void main(String[] args) 
    {
        constu con1 = new constu();
        constu con = new constu("Saurabh" , 23);
        con.disp();
    }    
}
