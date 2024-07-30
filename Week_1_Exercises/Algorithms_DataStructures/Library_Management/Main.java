import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> arr = new ArrayList<>();
        arr.add(new Book(1, "Book1", "A"));
        arr.add(new Book(7, "Book2", "A"));
        arr.add(new Book(3, "Book3", "B"));
        arr.add(new Book(12, "Book4", "C"));
        arr.add(new Book(8, "Book5", "B"));
        int pos = Search.LinearSearch(arr, "Book4");
        System.out.println("Position: "+pos);
        
        arr.sort((a,b) ->
            a.getTitle().compareTo(b.getTitle()));
        
        pos = Search.BinarySearch(arr, "Book1");
        System.out.println("Position: "+pos);

        pos = Search.BinarySearch(arr, "Book3");
        System.out.println("Position: "+pos);
    }
}
