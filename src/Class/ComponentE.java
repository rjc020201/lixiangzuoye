package Class;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ComponentE implements ComponentListener {
    GameJFrame gameJFrame;

    public ComponentE(GameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    @Override
    public void componentResized(ComponentEvent e) {
        gameJFrame.imageAdapter.setImage(gameJFrame.background.getScaledInstance(gameJFrame.getWidth(),gameJFrame.getHeight(), Image.SCALE_AREA_AVERAGING));
        gameJFrame.background = gameJFrame.imageAdapter.getImage();


    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
