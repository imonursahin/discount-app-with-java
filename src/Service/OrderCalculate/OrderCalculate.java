package Service.OrderCalculate;

import Controller.OrderController.Order;

public class OrderCalculate {

    public OrderCalculate(Order order) {

        String _cardType = order.getCardType();
        int _productPrice = order.getProductPrice();
        int _recordedTime = order.getRecordedTime();
        String _productCategory = order.getProductCategory();
        boolean _isFirstOrder = order.getIsFirstOrder();
        double _newPrice = 0;
        double _discount = 0;
        double _totalPrice = 0;



     if (_productCategory != "Phones"){
            if(_cardType == "Gold"){
                _discount = _productPrice * 0.3;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int)(_newPrice /200 ) *5;                System.out.println("Total Price " + _totalPrice);
            } else if (_cardType == "Silver"){
                _discount = _productPrice * 0.2;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int)(_newPrice /200 ) *5;
                System.out.println("Total Price " + _totalPrice);
            } else if (_isFirstOrder == false){
                _discount = _productPrice * 0.1;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int)(_newPrice /200 ) *5;
                System.out.println("Total Price " + _totalPrice);
            } else if (_recordedTime >= 2 ){
                _discount = _productPrice * 0.5;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int)(_newPrice /200 ) *5;
                System.out.println("Total Price " + _totalPrice);

            } else {
                System.out.println("Total Price " + _productPrice);
            }

     } else {

         System.out.println("Phones are not discounted");

         _discount = (int)(_productPrice / 200) * 5 ;
         _totalPrice = _productPrice - _discount;
         System.out.println("Total Price " + _totalPrice);



     }
     }


    }



