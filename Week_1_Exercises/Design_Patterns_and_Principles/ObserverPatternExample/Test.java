public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("TechCorp");

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Setting stock price to 150.00");
        stockMarket.setStockPrice(150.00);

        stockMarket.deregisterObserver(mobileApp);
        System.out.println("Setting stock price to 175.00");
        stockMarket.setStockPrice(175.00);
    }
}