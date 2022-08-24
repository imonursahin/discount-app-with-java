package Controller.ProductController;

public class Product  {

    String productName;
    String productCategory;
    int productPrice;

    public Product(String productName, String productCategory, int productPrice) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
    }

    // get product category
    public String getProductCategory() {
        return productCategory;
    }

    //get product price
    public int getProductPrice() {
        return productPrice;
    }









}
