import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> arr = new ArrayList<>();
        arr.add(new Product(1, "Prod1", "A", 1000f));
        arr.add(new Product(7, "Prod2", "A", 2000f));
        arr.add(new Product(3, "Prod3", "B", 4000f));
        arr.add(new Product(12, "Prod4", "C", 2300f));
        arr.add(new Product(8, "Prod5", "B", 6000f));
        int pos = Search.LinearSearch(arr, 8);
        System.out.println("Position: "+pos);
        
        arr.sort((a,b) ->
            a.getId().compareTo(b.getId()));

        // for (Product product : arr) {
        //     product.show();
        // }
        
        pos = Search.BinarySearch(arr, 7);
        System.out.println("Position: "+pos);

        pos = Search.BinarySearch(arr, 2);
        System.out.println("Position: "+pos);
    }
}
