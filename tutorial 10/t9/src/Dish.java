public class Dish {
    String name;
    double price;

    Dish(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void displayDish(){
        System.out.println("Name: "+name+" Price: "+price);
    }
}
