public class Main {
    public static double forecast(int n){
        if(n <= 0) return 0.0;
        if(n == 1) return 100.0;
        if(n == 2) return 120.0;
        return 0.8*forecast(n-1)+0.9*forecast(n-2);
    }

    public static void main(String[] args) {
        for(int i=0; i<=15; i++){
            System.out.println("Forecast "+i+" : "+forecast(i));
        }
    }
}
