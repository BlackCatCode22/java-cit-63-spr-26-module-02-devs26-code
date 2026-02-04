import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an input: ");
        String myString = userInput.nextLine();

        String reverseString = "";
        for (int i = myString.length() - 1; 0 <= i; i--) {
            reverseString += myString.charAt(i);
        }

        System.out.println(reverseString);

    }
}