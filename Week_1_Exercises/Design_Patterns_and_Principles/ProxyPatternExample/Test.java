public class Test{
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        System.out.println("Displaying first image:");
        image1.display();
        System.out.println("Displaying loaded image again:");
        image1.display();
        System.out.println("Displaying second image:");
        image2.display();
    }
}