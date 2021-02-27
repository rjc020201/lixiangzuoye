package Class;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyE implements java.awt.event.KeyListener {

    GameJFrame game_jframe;

    public KeyE(GameJFrame game_jframe) {
        this.game_jframe = game_jframe;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        game_jframe.hero.move_down = false;
        game_jframe.hero.move_up = false;
        game_jframe.hero.move_left = false;
        game_jframe.hero.move_right = false;

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            game_jframe. hero.move_up = true;
            game_jframe.hero.dirction = "UP";
            game_jframe.hero.y -= game_jframe.hero.speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            game_jframe.hero.move_right = true;
            game_jframe.hero.dirction = "RIGHT";
            game_jframe.hero.x += game_jframe.hero.speed;

        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            game_jframe.hero.move_left = true;
            game_jframe.hero.dirction = "LEFT";
            game_jframe.hero.x -= game_jframe.hero.speed;

        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            game_jframe.hero.move_down = true;
            game_jframe.hero.dirction = "DOWN";
            game_jframe.hero.y += game_jframe.hero.speed;

        }
        if (e.getKeyCode() == KeyEvent.VK_X) {
            game_jframe.bullets.add(game_jframe.hero.fire());

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            game_jframe.hero.move_up = false;

        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            game_jframe.hero.move_right = false;


        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            game_jframe.hero.move_left = false;


        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            game_jframe.hero.move_down = false;


        }


    }
}

