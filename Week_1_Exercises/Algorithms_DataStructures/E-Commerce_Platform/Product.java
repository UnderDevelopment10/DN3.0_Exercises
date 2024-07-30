public class Product {
    Integer productId;
    String productName;
    String productCategory;
    Float productPrice = 0.0f;

    public Product(Integer id, String name, String category, Float price){
        productId = id;
        productName = name;
        productCategory = category;
        productPrice = price;
    }
    
    public Integer getId(){
        return productId;
    }
    public String getName(){
        return productName;
    }
    public String getCategory(){
        return productCategory;
    }
    public Float getPrice(){
        return productPrice;
    }
    public void setName(String name){
        productName = name;
    }
    public void setCategory(String category){
        productCategory = category;
    }
    public void setPrice(Float price){
        productPrice = price;
    }
    public void show(){
        System.out.println(this.getId()+"\t"+this.getName()+"\t"+this.getCategory()+"\t"+this.getPrice());
    }
}
