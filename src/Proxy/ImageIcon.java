package Proxy;

public class ImageIcon implements Icon {
    private final String imageUrl;

    public ImageIcon(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconSize() {
        return 300;
    }

    @Override
    public void paintIcon() {
        System.out.println("Download some picture from " + imageUrl);;
    }
}
