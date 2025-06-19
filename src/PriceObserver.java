public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double newPrice = order.getTotalPrice() - 20;
            order.setTotalPrice(newPrice);
            System.out.println("PriceObserver: $20 discount applied. New total: $" + newPrice);
        }
    }
}
