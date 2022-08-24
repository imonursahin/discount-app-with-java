import Controller.OrderController.Order;
import Controller.ProductController.Product;
import Controller.UserController.User;
import Service.OrderCalculate.OrderCalculate;

public class Main {
    public static void main(String[] args) {

        OrderCalculate orderCalculate = new OrderCalculate(new Order(
                new User("Onur", "Gold", 3, false),
                new Product("X plus", "Phones", 950)));

        System.out.println(orderCalculate);



    }
}
