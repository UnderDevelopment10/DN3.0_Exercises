import java.util.ArrayList;

public class Sort {
    public static void BubbleSort(ArrayList<Order> arr){
        int n = arr.size()-1;
        Order temp;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr.get(j).getPrice() > arr.get(j+1).getPrice()){
                    temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }

    public static void QuickSort(ArrayList<Order> arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            QuickSort(arr, low, j - 1);
            QuickSort(arr, j+1, high);
        }
    }

    private static int partition(ArrayList<Order> arr, int low, int high) {
        Order pivot = arr.get(high);
        int i = (low-1);

        for (int j = low; j < high; j++) {
            if (arr.get(j).getPrice() < pivot.getPrice()) {
                i++;
                Order temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Order temp = arr.get(i+1);
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);

        return i+1;
    }
}
