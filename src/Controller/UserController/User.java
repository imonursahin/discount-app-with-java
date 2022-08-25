package Controller.UserController;

public class User {

    String customerName;
    String cardType;
    int recordedTime;
    boolean isFirstOrder;


    public User(String customerName, String cardType, int recordedTime, boolean isFirstOrder) {
        this.customerName = customerName;
        this.cardType = cardType;
        this.recordedTime = recordedTime;
        this.isFirstOrder = isFirstOrder;
    }

    // get card type
    public String getCardType() {
        return cardType;
    }

    //get recorded time
    public int getRecordedTime() {
        return recordedTime;
    }

    //get isFirstOrder
    public boolean getIsFirstOrder() {
        return isFirstOrder;
    }


}
