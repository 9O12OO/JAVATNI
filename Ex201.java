import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
        String Product_id = "PB-001";
        String Product_name = "Pencil Box";
        int item = 112;
        double price_per_item = 30.20;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.println("Product name: "  + Product_name + " (" + Product_id + ")");
        System.out.println("product item:" + item + " (" + price_per_item + " baht/piece)");

        double total_price = item * price_per_item;
        System.out.println("Total price:" + frm.format(total_price) + "baht");

    }
}
