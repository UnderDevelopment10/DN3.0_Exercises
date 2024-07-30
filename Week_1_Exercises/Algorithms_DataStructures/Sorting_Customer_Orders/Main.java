import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> arr1 = new ArrayList<>();
        arr1.add(new Order(1, "Order1", 2400f));
        arr1.add(new Order(2, "Order2", 5000f));
        arr1.add(new Order(3, "Order3", 1200f));
        arr1.add(new Order(4, "Order4", 2540f));
        arr1.add(new Order(5, "Order5", 4900f));
        Sort.BubbleSort(arr1);
        System.out.println("By BubbleSort:");
        for(Order x: arr1){
            System.out.println(x.getId()+"\t"+x.getPrice());
        }
        
        arr1.clear();
        arr1.add(new Order(1, "Order1", 2400f));
        arr1.add(new Order(2, "Order2", 5000f));
        arr1.add(new Order(3, "Order3", 1200f));
        arr1.add(new Order(4, "Order4", 2540f));
        arr1.add(new Order(5, "Order5", 4900f));
        Sort.QuickSort(arr1, 0, arr1.size()-1);
        System.out.println("\nBy QuickSort:");
        for(Order x: arr1){
            System.out.println(x.getId()+"\t"+x.getPrice());
        }
    }
}
