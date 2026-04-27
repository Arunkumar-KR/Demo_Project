// To find the Leap year or not
// modified by siva suriya rajan
// simple programm
//Modified by Arun KR
// modified good
// stach example
//stach example..........


public class Leapyear {
   public static void main(String[] args) {
       int year = 2024;
       if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
           System.out.println(year + " is a leap year.");
       } else {
           System.out.println(year + " is not a leap year.");
       }
   }
}