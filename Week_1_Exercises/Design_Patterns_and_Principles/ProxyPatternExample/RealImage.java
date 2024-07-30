public class RealImage implements Image {
    private String imageUrl;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromRemoteServer();
    }

    private void loadImageFromRemoteServer() {
        System.out.println("Loading image from remote server: " + imageUrl);
        System.out.println("Image loaded: " + imageUrl);
    }

    public void display() {
        System.out.println("Displaying image: " + imageUrl);
    }
}