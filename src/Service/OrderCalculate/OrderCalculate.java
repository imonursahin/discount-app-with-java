package Service.OrderCalculate;

import Controller.OrderController.Order;

public class OrderCalculate {
    double _newPrice = 0;
    double _discount = 0;
    double _totalPrice = 0;

    Order _order;

    public OrderCalculate(Order order) {
        _order = order;

    }

    public double getTotalPrice() {
        String _cardType = _order.getCardType();
        int _productPrice = _order.getProductPrice();
        int _recordedTime = _order.getRecordedTime();
        String _productCategory = _order.getProductCategory();
        boolean _isFirstOrder = _order.getIsFirstOrder();


        if (_productCategory != "Phones") {
            if (_cardType == "Gold") {
                _discount = _productPrice * 0.3;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int) (_newPrice / 200) * 5;
                return _totalPrice;
            } else if (_cardType == "Silver") {
                _discount = _productPrice * 0.2;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int) (_newPrice / 200) * 5;
                return _totalPrice;

            } else if (_isFirstOrder == false) {
                _discount = _productPrice * 0.1;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int) (_newPrice / 200) * 5;
                return _totalPrice;


            } else if (_recordedTime >= 2) {
                _discount = _productPrice * 0.5;
                _newPrice = _productPrice - _discount;
                _totalPrice = _newPrice - (int) (_newPrice / 200) * 5;
                return _totalPrice;


            } else {
                return _totalPrice;

            }

        } else {
            _discount = (int) (_productPrice / 200) * 5;
            _totalPrice = _productPrice - _discount;
            return _totalPrice;


        }
    }


}



