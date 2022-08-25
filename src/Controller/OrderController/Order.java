package Controller.OrderController;

import Controller.ProductController.Product;
import Controller.UserController.User;

public class Order {

    private final User user;
    private final Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    // get customer cardType
    public String getCardType() {
        return user.getCardType();
    }

    // get product price
    public int getProductPrice() {
        return product.getProductPrice();
    }

    // get customer recordedTime
    public int getRecordedTime() {
        return user.getRecordedTime();
    }

    // get product category
    public String getProductCategory() {
        return product.getProductCategory();
    }

    // get isFirstOrder
    public boolean getIsFirstOrder() {
        return user.getIsFirstOrder();
    }


}
