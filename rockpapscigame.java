import java.util.Scanner;
import java.util.Random;
public class rockpapscigame {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random rand = new Random();
        int i = 1;
        while (i<=3 ){
            System.out.println("We'll play 3 times, this is " + i + " time.");
            String rule = "Rules => 1 is rock;\n\t\t 2 is paper;\n\t\t 3 is scissors.";
            System.out.println(rule);
            System.out.println("now choose. ");
            System.out.println("enter a value: ");
            int player = scr.nextInt();
            int computer = rand.nextInt(1, 4);
            if (player==computer){
                System.out.println("its a tie");
            } else if ((computer==2 && player==1)||(computer==3 && player==2)||(computer==1 && player==3)) {
                System.out.println("computer wins, it choose: " + computer + "\n" + rule);
            } else if ((computer==1 && player==2)||(computer==2 && player==3)||(computer==3 && player==1)) {
                System.out.println("you won, computer choose: " + computer + "\n" + rule);
            }
            i++;
        }
    }
}
