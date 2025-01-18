public class Order {
    Dish dish;
    int quantity;

    Order(Dish dish,int quantity){
        this.dish = dish;
        this.quantity = quantity;
    }

    public double calculateTotal(){
        return dish.price*quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Order: " + dish.name + ", Quantity: " + quantity +
                ", Total Price: " + calculateTotal());
    }
}
