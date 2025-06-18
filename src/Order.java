import java.util.List;
import java.util.ArrayList;

public class Order {
    // Skeleton attributes
    private int id;
    private int itemCount;
    private double itemCost;
    private double shippingCost;
    private List<OrderObserver> observers;

    public Order(int id) {
        // Constructor skeleton (no logic)
    }

    // Skeleton method to attach an observer
    public void attach(OrderObserver observer) {
        // Method skeleton
    }

    // Skeleton method to detach an observer
    public void detach(OrderObserver observer) {
        // Method skeleton
    }

    // Skeleton method to notify observers
    public void notifyObservers() {
        // Method skeleton
    }

    // Skeleton method to add an item to the order
    public void addItem(double price) {
        // Method skeleton
    }

    // Skeleton method to get total price
    public double getTotalPrice() {
        return 0.0; // Placeholder
    }

    // Skeleton method to get item count
    public int getCount() {
        return 0; // Placeholder
    }

    @Override
    public String toString() {
        return ""; // Placeholder
    }
}
