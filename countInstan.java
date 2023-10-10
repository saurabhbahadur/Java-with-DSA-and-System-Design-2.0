//1.Create a class that keeps track of the number of instances created. Implement a static variable and method to accomplish this.
public class countInstan
{

    private static int instanceCount = 0;

    public  countInstan() 
    {
		instanceCount++;
	}

    public static int getInstanceCount() 
    {
        return instanceCount;
    }

    public static void main(String[] args) 
    {
        countInstan c1 = new countInstan();
        countInstan c2 = new countInstan();
        countInstan c3 = new countInstan();
        
        System.out.println("Number of instances created:" + countInstan.getInstanceCount());
    }   
}
