import java.util.Scanner;

public class main {
    static int getValue(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valueA = getValue(scanner, "Enter value A: ");
        int valueB = getValue(scanner, "Enter value B: ");
        int valueC = getValue(scanner, "Enter value C: ");
        int largest = 0;

        if (valueA > valueB) {
            if (valueA > valueC) {
                largest = valueA;
            }
            else {
                largest = valueC;
            }
        }
        else {
            if (valueB > valueC) {
                largest = valueB;
            }
            else {
                largest = valueC;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}