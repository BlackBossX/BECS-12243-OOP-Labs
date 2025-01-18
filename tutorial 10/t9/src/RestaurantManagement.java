public class RestaurantManagement {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Pasta", 550.00);
        Dish dish2 = new Dish("Pizza", 1200.00);
        Restaurant restaurant = new Restaurant(3);
        restaurant.addOrder(new Order(dish1, 2));
        restaurant.addOrder(new Order(dish2, 1));
        restaurant.addOrder(new Order(dish2, 5));
       // restaurant.addOrder(new Order(dish1, 3));

        restaurant.displayAllOrders();
    }
}