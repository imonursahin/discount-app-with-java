import Controller.OrderController.Order;
import Controller.ProductController.Product;
import Controller.UserController.User;
import Service.OrderCalculate.OrderCalculate;

public class Main {
    public static void main(String[] args) {

        // Customer
        String _customerName = "Onur";
        String _cardType = "Gold";
        int _recordedTime = 3;
        boolean _isFirstOrder = false;

        // Product
        String _productName = "X plus";
        String _productCategory = "Electronic";
        int _productPrice = 950;


        OrderCalculate customerOrder1 = new OrderCalculate(new Order(
                new User(_customerName, _cardType, _recordedTime, _isFirstOrder),
                new Product(_productName, _productCategory, _productPrice)));

        System.out.println("Total Price: " + customerOrder1.getTotalPrice());


    }
}
