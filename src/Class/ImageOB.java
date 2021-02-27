package Class;

import java.awt.*;
import java.awt.image.ImageObserver;

public class ImageOB implements ImageObserver {
    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
