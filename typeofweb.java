import java.util.Scanner;
public class typeofweb {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a url of .in or.org or .com: ");
        String url = scr.nextLine();
        if(url.endsWith(".com")){
            System.out.println("it is a commercial site.");
        }
        else if (url.endsWith(".org")) {
            System.out.println("it is an organisational site.");
        }
        else if (url.endsWith(".in")){
            System.out.println("it is an indian site");
        }
        else {
            System.out.println("i dont know this site.");
        }
    }
}
