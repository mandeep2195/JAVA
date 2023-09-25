import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = scr.nextInt();
        if (((year%4==0) && (year%100!=0)) ||(year%400==0)){
            System.out.println("its a leap year");
        }
        else {
            System.out.println("not a leap year");
        }


    }
}
