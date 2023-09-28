// Write a Java program to calculate the sum of all elements in an integer array?
public class sumArray 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,4,1,5,7};
        int sum=0;

        for(int i =0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }    
}
