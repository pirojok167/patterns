package Proxy;

import java.util.concurrent.ThreadLocalRandom;

public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    final String imageUrl;

    public ImageProxy(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconSize() {
        return imageIcon != null ? imageIcon.getIconSize() : 0;
    }

    @Override
    public void paintIcon() {
        // If image is downloaded, show real subject
        if (imageIcon != null) {
            imageIcon.paintIcon();
            return;
        }

        // If image isn't downloaded, show stub
        System.out.println("Stub picture");

        // When image is downloaded, set real subject
        if (ThreadLocalRandom.current().nextInt(0, 1) == 1) {
            imageIcon = new ImageIcon(imageUrl);
        }
        this.paintIcon();
    }
}
