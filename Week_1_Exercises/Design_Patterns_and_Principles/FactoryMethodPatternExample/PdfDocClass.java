public class PdfDocClass implements PdfDocument{
    public void open(){
        System.out.println("Opening Pdf Document...");
    }
    public void close(){
        System.out.println("Closing Pdf Document...");
    }
}
