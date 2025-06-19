import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();

        // Simulate 3 separate orders
        for (int i = 0; i < 3; i++) {
            int orderNumber = 100 + random.nextInt(900); // random ID between 100 and 999
            Order order = new Order(); // or: new Order(orderNumber) if your class supports it

            // Register observers
            order.attach(new PriceObserver());
            order.attach(new QuantityObserver());

            // Generate between 4 and 9 items
            int totalItems = 4 + random.nextInt(6);
            System.out.println("------ New Order ID: " + orderNumber + " ------");
            System.out.println("Adding " + totalItems + " products:\n");

            for (int j = 0; j < totalItems; j++) {
                double itemPrice = 15 + random.nextInt(36); // price between $15 and $50
                System.out.printf("  ➤ Item %d: $%.2f%n", j + 1, itemPrice);
                order.addItem(itemPrice);
            }

            // Display summary
            System.out.println("\nFinal Order Recap:");
            System.out.println(order);
            System.out.println("------------------------------\n");
        }
    }
}
