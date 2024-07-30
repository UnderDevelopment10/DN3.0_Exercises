public class ProxyImage implements Image {
    private String imageUrl;
    private RealImage realImage;

    public ProxyImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imageUrl);
        }
        realImage.display();
    }
}