import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter numder 1: ");
        double num_1 = Integer.parseInt(scan.next());
        System.out.print("Enter numder 2: ");
        double num_2 = Integer.parseInt(scan.next());

        System.out.println("Summation = " + (num_1 + num_2));
        System.out.println("Subtraction = " + (num_1 - num_2));
        System.out.println("Multiplication = " + (num_1 * num_2));
        System.out.println("Division = " + (num_1 / num_2));
        System.out.println("Modulus = " + (num_1 % num_2));
    }
}
