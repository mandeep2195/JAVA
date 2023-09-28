import java.util.Scanner;
import java.util.Random;

class Generator{
    public int random;
    public int Generator(){
        Random rand = new Random();
        random = rand.nextInt(100);
        return random;
    }
    public int guessnum;
    public int takeUserInput(){
        System.out.println("Enter a number between 1 to 100: ");
        Scanner scr = new Scanner(System.in);
        guessnum = scr.nextInt();
        return guessnum;
    }
    public void iscorrectnum() {
        int points = 0;
        while (true){
            if (guessnum == random) {
                break;
            } else if (guessnum > random) {
                System.out.println("Guess Lower.");
                points = points + 1;
                takeUserInput();
            } else {
                System.out.println("Guess Higher.");
                points = points + 1;
                takeUserInput();
            }

        }
        System.out.println("You Finally Guessed it right " + guessnum + " = " + random + " in " + points + " turns!");

    }
}



public class GuessTheNum {
    public static void main(String[] args) {
        Generator randomNum = new Generator();
        randomNum.Generator();
        randomNum.takeUserInput();
        randomNum.iscorrectnum();
    }
}
