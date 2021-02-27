package Class;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgainActionListener implements ActionListener {
    GameJFrame gameJFrame;
    public AgainActionListener(GameJFrame gameJFrame){
        this.gameJFrame = gameJFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        gameJFrame.hero.alive =true;
        gameJFrame.hero.kill = 0;
        gameJFrame.counter = 0;
        gameJFrame.victory =gameJFrame.defeat =false;
        gameJFrame.enemies.clear();
        gameJFrame.bullets.clear();


        new CreateEmeny(gameJFrame).start();
        gameJFrame.button3.setFocusable(false);
        gameJFrame.setFocusable(true);
        gameJFrame.requestFocus();
        gameJFrame.remove(gameJFrame.button2);
        gameJFrame.remove(gameJFrame.button3);

    }
}
