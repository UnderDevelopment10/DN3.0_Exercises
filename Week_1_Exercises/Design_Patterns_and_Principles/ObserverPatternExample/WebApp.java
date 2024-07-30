public class WebApp implements Observer {
    public void update(String stockName, double stockPrice) {
        System.out.println("WebApp: Stock " + stockName + " updated to " + stockPrice);
    }
}