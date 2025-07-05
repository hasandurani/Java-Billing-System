import java.util.Scanner;

public class BillingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double TAX_RATE = 0.08; // 8% tax
        double total = 0;

        System.out.print("Enter number of items: ");
        int itemCount = input.nextInt();
        input.nextLine(); // consume newline

        String[] itemNames = new String[itemCount];
        double[] itemPrices = new double[itemCount];
        int[] itemQuantities = new int[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter name of item " + (i + 1) + ": ");
            itemNames[i] = input.nextLine();

            System.out.print("Enter quantity of " + itemNames[i] + ": ");
            itemQuantities[i] = input.nextInt();

            System.out.print("Enter price of " + itemNames[i] + ": ");
            itemPrices[i] = input.nextDouble();

            input.nextLine(); // consume newline

            total += itemPrices[i] * itemQuantities[i];
        }

        double tax = total * TAX_RATE;
        double grandTotal = total + tax;

        System.out.println("\n--- Final Bill ---");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(itemNames[i] + " x" + itemQuantities[i] + " = " + (itemPrices[i] * itemQuantities[i]));
        }
        System.out.println("Subtotal: " + total);
        System.out.println("Tax (8%): " + tax);
        System.out.println("Total Amount: " + grandTotal);

        input.close();
    }
}
