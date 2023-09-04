import java.util.Scanner;

public class HW_LeapYear_dsonger
{
   
   
    
    public static void main(String[] args)
    {
      float rem; //initialize rem
      String test; // init test
      int year; //init year
      int rem400, rem100, rem4; // init rem400, rem100, rem4
      
      
      
      Scanner keyboard = new Scanner(System.in); //keyboard input for year
      
      
      System.out.println("Please enter a year."); //The user enters a year
      
      year = keyboard.nextInt(); // set year with keyboard input
      
      rem400 = year % 400; // set rem400 to remainder of year % 400
      
      
      rem100 = (year% 100); // set rem100 to remainder of year % 100
       
      
      rem4 = (year% 4); // set rem4 to remainder of year % 4
      
      test = (rem400 == 0)? " is a leap year" : ((rem100 != 0) ? ((rem4 ==0) ? " is a leap year " : " is not a leap year") : " is not a leap year")  ; // uses nested ternary operator to test the remainder values
      
      System.out.println(year + test); //prints 
      
   }
     
}