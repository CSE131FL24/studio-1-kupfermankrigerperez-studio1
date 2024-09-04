package studio1;

import java.util.Scanner;

public class LeapYear {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Enter a year: ");
int year = in.nextInt();
boolean isd4 = year % 4 == 0;
boolean isd100 = year % 100 != 0;
boolean isd400 = year % 400 == 0;
System.out.println(year + " is a leap year: " + ((isd4 && isd100) || isd400));
}

}

