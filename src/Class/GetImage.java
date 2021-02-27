package Class;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GetImage {
    public static Image getImage(String path) {
        BufferedImage bi=null;
        URL u=GetImage.class.getClassLoader().getResource(path);
        try {
            bi= ImageIO.read(u);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return bi;
    }
}
