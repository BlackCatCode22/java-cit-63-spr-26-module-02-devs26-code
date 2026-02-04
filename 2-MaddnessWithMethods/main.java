import java.util.Scanner;

public class main {
    static int getAnIntFromTheUser(Scanner scanner, String input) {
        System.out.print(input);
        return scanner.nextInt();
    }

    static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else if (a < b) {
            System.out.println(a + " is less than " + b);
        }
        else {
            System.out.println("Both are equal.");
        }
    }

    static void sumTwoInts(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of both values is " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInputA = getAnIntFromTheUser(scanner, "Enter a number: ");
        int userInputB = getAnIntFromTheUser(scanner, "Enter another number: ");
        compareTwoInts(userInputA, userInputB);
        sumTwoInts(userInputA, userInputB);
    }
}