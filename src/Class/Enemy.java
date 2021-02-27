package Class;

import java.awt.*;

public class Enemy {
    Image enemyimage = GetImage.getImage("Picture/enemy.png");
    int x;
    int y;

    boolean move_up = false;
    boolean move_down = false;
    boolean move_left = false;
    boolean move_right = false;
    String dirction;
    int speed = 2;
    boolean alive = true;

    public Enemy() {
    }

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(GameJFrame gameJFrame){
        if(x>gameJFrame.hero.x){
            if(x-gameJFrame.hero.x > speed){
                x-=speed;
            }
            else {
                x=gameJFrame.hero.x;
            }
        }

        if(x<gameJFrame.hero.x){
            if(gameJFrame.hero.x - x > speed){
                x+=speed;
            }else {
                x=gameJFrame.hero.x;
            }
        }
        if(y<gameJFrame.hero.y){
            if(gameJFrame.hero.y - y > speed){
                y+=speed;
            }else {
                y=gameJFrame.hero.y;
            }
        }
        if(y>gameJFrame.hero.y){
            if(-gameJFrame.hero.y +


                    y > speed){
                y-=speed;
            }else {
                y=gameJFrame.hero.y;
            }
        }


    }
    public Rectangle getRet() {
        return new Rectangle(x,y,enemyimage.getWidth(new ImageOB()),enemyimage.getHeight(new ImageOB()));
    }


}
