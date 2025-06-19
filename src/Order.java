import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private int itemCount = 0;
    private double totalPrice = 0;
    private double shippingCost = 10; // default

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
        notifyObservers();
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double cost) {
        this.shippingCost = cost;
    }

    @Override
    public String toString() {
        return "Order Summary:\n" +
                "- Items: " + itemCount + "\n" +
                "- Total Price: $" + totalPrice + "\n" +
                "- Shipping: $" + shippingCost;
    }
}
