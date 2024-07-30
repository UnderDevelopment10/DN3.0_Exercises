import java.util.ArrayList;

public class Search {
    Search(){}

    public static int LinearSearch(ArrayList<Product> array, int keyid){
        for(int i=0; i<array.size(); i++){
            if(array.get(i).getId() == keyid){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(ArrayList<Product> array, int keyid){
        int low = 0, high = array.size()-1;
        while(low+1 < high){
            int mid = (low+high)/2;
            if(array.get(mid).getId() == keyid){
                return mid;
            }    
            else if(array.get(mid).getId() < keyid){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        if(array.get(low).getId() == keyid) return low;
        if(array.get(high).getId() == keyid) return high;
        return -1;
    }
}
