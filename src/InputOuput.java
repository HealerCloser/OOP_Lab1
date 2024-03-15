import java.util.Scanner;

public class InputOuput {
    public static void main(String args[]){
        Scanner keybaord = new Scanner(System.in);
        System.out.println("Whats your name?");
        String strname = keybaord.nextLine();
        System.out.println("How old are you?");
        int age = keybaord.nextInt();
        System.out.println("How tall are you (m)?");
        double height = keybaord.nextDouble();

        System.out.println("Mrs/Mr. " + strname + ", " + age + "years old" + ", " + "Your height is " + height + ".");

    }
}
