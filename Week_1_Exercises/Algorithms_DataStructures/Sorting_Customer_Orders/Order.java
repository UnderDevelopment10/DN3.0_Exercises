
public class Order {
    Integer orderId;
    String customerName;
    Float totalPrice;
    Order(Integer id, String name, Float price){
        orderId = id;
        customerName = name;
        totalPrice = price;
    }

    public Integer getId(){
        return orderId;
    }
    public Float getPrice(){
        return totalPrice;
    }
}
