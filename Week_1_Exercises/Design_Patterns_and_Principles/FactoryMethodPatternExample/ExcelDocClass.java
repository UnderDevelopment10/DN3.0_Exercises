public class ExcelDocClass implements ExcelDocument{
    public void open(){
        System.out.println("Opening Excel Document...");
    }
    public void close(){
        System.out.println("Closing Excel Document...");
    }
}
