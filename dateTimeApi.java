// 1. WAP to display current date and time in java?

import java.time.*;

public class dateTimeApi 
{
    public static void main(String[] args) 
    {
        LocalDate date = LocalDate.now();
            System.out.println(date);
        LocalTime time = LocalTime.now();
            System.out.println(time);
    }
}