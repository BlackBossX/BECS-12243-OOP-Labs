public class Restaurant {
    Order[] orders;
    int orderCount;
    int currentOrderCount;

//    static int p =0;

    Restaurant(int orderCount){
        orders = new Order[orderCount];
        this.currentOrderCount = 0;

    }

    public void addOrder(Order order){
        if (true) {
            orders[currentOrderCount] = order;
            currentOrderCount++;
        } else {
            System.out.println("Cannot add more orders. Maximum capacity reached.");
        }
    }


    public void displayAllOrders() {
        System.out.println("All Orders:");
        for (int i = 0; i < currentOrderCount; i++) {
            orders[i].displayOrderDetails();
        }
    }
}
