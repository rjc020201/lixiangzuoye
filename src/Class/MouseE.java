package Class;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseE implements MouseListener, MouseMotionListener {
    GameJFrame gameJFrame;

    public MouseE(GameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        gameJFrame.imageAdapter.setImage(gameJFrame.background.getScaledInstance(gameJFrame.getWidth(),gameJFrame.getHeight(), Image.SCALE_AREA_AVERAGING));
        gameJFrame.background = gameJFrame.imageAdapter.getImage();
        System.out.println("111");


    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
