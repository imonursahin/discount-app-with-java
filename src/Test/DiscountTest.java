package Test;

import Controller.OrderController.Order;
import Controller.ProductController.Product;
import Controller.UserController.User;
import Service.OrderCalculate.OrderCalculate;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiscountTest {

    @Test
    public void testGoldDiscount() {
        String _cardType = "Gold";
        int _recordedTime = 0;
        boolean _isFirstOrder = false;
        String _productCategory = "Electronic";
        double _totalPrice = 0;

        OrderCalculate customerOrder1 = new OrderCalculate(new Order(
                new User("Onur", _cardType, _recordedTime, _isFirstOrder),
                new Product("X plus", _productCategory, 950)));

        _totalPrice = customerOrder1.getTotalPrice();
        assertTrue(_totalPrice == 650);

    }

    @Test
    public void testSilverDiscount() {
        String _cardType = "Silver";
        int _recordedTime = 0;
        boolean _isFirstOrder = false;
        String _productCategory = "Electronic";
        double _totalPrice = 0;

        OrderCalculate customerOrder1 = new OrderCalculate(new Order(
                new User("Onur", _cardType, _recordedTime, _isFirstOrder),
                new Product("X plus", _productCategory, 950)));

        _totalPrice = customerOrder1.getTotalPrice();
        assertTrue(_totalPrice == 745);

    }

    @Test
    public void testIsFirstOrderDiscount() {
        String _cardType = "";
        int _recordedTime = 0;
        boolean _isFirstOrder = false;
        String _productCategory = "Electronic";
        double _totalPrice = 0;

        OrderCalculate customerOrder1 = new OrderCalculate(new Order(
                new User("Onur", _cardType, _recordedTime, _isFirstOrder),
                new Product("X plus", _productCategory, 950)));

        _totalPrice = customerOrder1.getTotalPrice();
        assertTrue(_totalPrice == 835);

    }

    @Test
    public void testRecordedDiscount() {
        String _cardType = "";
        int _recordedTime = 3;
        boolean _isFirstOrder = true;
        String _productCategory = "Electronic";
        double _totalPrice = 0;

        OrderCalculate customerOrder1 = new OrderCalculate(new Order(
                new User("Onur", _cardType, _recordedTime, _isFirstOrder),
                new Product("X plus", _productCategory, 950)));

        _totalPrice = customerOrder1.getTotalPrice();
        assertTrue(_totalPrice == 465);

    }

    @Test
    public void testProductCategoryDiscount() {
        String _cardType = "";
        int _recordedTime = 0;
        boolean _isFirstOrder = true;
        String _productCategory = "Phones";
        double _totalPrice = 0;

        OrderCalculate customerOrder1 = new OrderCalculate(new Order(
                new User("Onur", _cardType, _recordedTime, _isFirstOrder),
                new Product("X plus", _productCategory, 950)));

        _totalPrice = customerOrder1.getTotalPrice();
        assertTrue(_totalPrice == 930);

    }


}
