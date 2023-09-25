import java.util.Scanner;
public class ifstudentpass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the marks of science: ");
        float sci = scr.nextFloat();
        System.out.println("Enter the marks of english: ");
        float eng = scr.nextFloat();
        System.out.println("Enter the marks of maths: ");
        float math = scr.nextFloat();
        float sum = sci+eng+math;
        float per = (sum/300f)*100f;
        System.out.println("The total percentage is: " + per);
        if (math>=33) {
            System.out.println("you are pass in maths");
        }
        else{
            System.out.println("you are failed in maths.");
        }
        if (eng>=33) {
            System.out.println("you are pass in eng");
        }
        else{
            System.out.println("you are failed in eng.");
        }
        if (sci>=33) {
            System.out.println("you are pass in sci");
        }
        else{
            System.out.println("you are failed in sci.");
        }
        if (per>=40 && sci>=33 && eng>=33 && math>= 33) {
            System.out.println("you are pass overall.");
        }

        else{
            System.out.println("final result = you are failed.");
        }


    }
}
