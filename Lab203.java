import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter product id  : ");
        String product_id = scan.next();

        System.out.print("Enter product name: ");
        String product_name = scan.next();

        scan.nextLine();
        System.out.print("Enter product item: ");
        int product_item = scan.nextInt();

        System.out.print("Enter product per piece: ");
        double product_priece = scan.nextDouble();

        double total_priec = product_item * product_priece;

        System.out.println("--------------------");

        System.out.println("Product name: " + product_name + "(" +  product_id + ")");
        System.out.println("Product item: " + product_item + "(" +  product_priece + "baht/piece)");
        System.out.println("Product name: " + total_priec + " baht");
    }
}
