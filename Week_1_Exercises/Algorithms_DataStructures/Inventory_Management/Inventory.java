import java.util.HashMap;

public class Inventory {
    HashMap<Integer, Product> inventory;
    
    Inventory(){
        inventory = new HashMap<Integer, Product>();
    }

    public void add(Product prod) throws IllegalArgumentException{
        if(inventory.containsKey(prod.getId())){
            throw new IllegalArgumentException("Product id "+prod.getId()+" already present in inventory.");
        }
        inventory.put(prod.getId(), prod);
    }
    
    public void update(Integer id, String name, Integer quantity, Float price) throws IllegalArgumentException{
        if(!inventory.containsKey(id)){
            throw new IllegalArgumentException("Product id "+id+" not present in inventory.");
        }
        Product prod = inventory.get(id);
        if(name != null){
            prod.setName(name);
        }
        if(quantity != null){
            prod.setQuantity(quantity);
        }
        if(price != null){
            prod.setPrice(price);
        }
    }

    public void delete(Integer id) throws IllegalArgumentException{
        if(!inventory.containsKey(id)){
            throw new IllegalArgumentException("Product id "+id+" not present in inventory.");
        }
        inventory.remove(id);
    }
    
    public Product get(Integer id) throws IllegalArgumentException{
        if(!inventory.containsKey(id)){
            throw new IllegalArgumentException("Product id "+id+" not present in inventory.");
        }
        return inventory.get(id);
    }

    public void display(){
        System.out.println("Products in inventory:");
        inventory.forEach(
            (key, value)
                -> System.out.println(value.getId()+"\t"+value.getName()+"\t"+value.getQuantity()+"\t"+value.getPrice())
        );
    }
}
