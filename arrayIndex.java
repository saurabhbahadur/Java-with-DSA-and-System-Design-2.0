
// Write a Java program to find the index of a specific element in an integer array.?
// This program i solved by little complex method for better understanding i used user input and i print every output in this code 

import java.util.*;

public class arrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Enter the number of element you want to Enter in array");

        int len = sc.nextInt();

        int arr[] = new int[len]; // entering size of array by user

        System.out.println("======================================================");
        System.out.println("Enter " + len + " number for an array:");
        System.out.println("======================================================");
        for (int i = 0; i < len; i++) { // entering number one by one in array
            System.out.println("Enter " + i + " index number for an array:");
            arr[i] = sc.nextInt();
        }
        System.out.println("======================================================");
        System.out.println("The number for an array you  entered are:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(+arr[i]); // displaying numbers user entered in array
        }
        System.out.println("======================================================");
        System.out.println("Enter the number you want to search index");
        int target = sc.nextInt();
        System.out.println("======================================================");
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { // searching the number is in array or not
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The number you enter is in array of index:" + index);
        } else {
            System.out.println("The number you entered in not in araay");
        }

        System.out.println("======================================================");

        sc.close();
    }

}
