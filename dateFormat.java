// 2. Write a program to convert a date to a string in the format "MM/dd/yyyy".

import java.time.*;
import java.time.format.DateTimeFormatter;
public class dateFormat 
{
    public static void main(String[] args) 
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }    
}
