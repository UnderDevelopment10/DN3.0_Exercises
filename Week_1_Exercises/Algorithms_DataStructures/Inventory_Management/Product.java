public class Product {
    Integer productId;
    String productName;
    Integer productQuantity = 0;
    Float productPrice = 0.0f;

    public Product(Integer id, String name, Integer quantity, Float price){
        productId = id;
        productName = name;
        productQuantity = quantity;
        productPrice = price;
    }
    
    public Integer getId(){
        return productId;
    }
    public String getName(){
        return productName;
    }
    public Integer getQuantity(){
        return productQuantity;
    }
    public Float getPrice(){
        return productPrice;
    }
    public void setName(String name){
        productName = name;
    }
    public void setQuantity(Integer quantity){
        productQuantity = quantity;
    }
    public void setPrice(Float price){
        productPrice = price;
    }
    public void show(){
        System.out.println(this.getId()+"\t"+this.getName()+"\t"+this.getQuantity()+"\t"+this.getPrice());
    }
}
