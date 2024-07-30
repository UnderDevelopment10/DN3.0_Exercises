import java.util.ArrayList;

public class Search {
    Search(){}

    public static int LinearSearch(ArrayList<Book> array, String title){
        for(int i=0; i<array.size(); i++){
            if(array.get(i).getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(ArrayList<Book> array, String title){
        int low = 0, high = array.size()-1;
        while(low+1 < high){
            int mid = (low+high)/2;
            if(array.get(mid).getTitle().compareTo(title) == 0){
                return mid;
            }
            else if(array.get(mid).getTitle().compareTo(title) < 0){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        if(array.get(low).getTitle().compareTo(title) == 0) return low;
        if(array.get(high).getTitle().compareTo(title) == 0) return high;
        return -1;
    }
}
