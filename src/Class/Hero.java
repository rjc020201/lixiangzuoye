package Class;

import java.awt.*;

public class Hero {
    Image heroimage = GetImage.getImage("Picture/hero.png");
    int x= 0;
    int y =0;
    int kill = 0;
    boolean move_up=false;
    boolean move_down= false;
    boolean move_left = false;
    boolean move_right = false;
    String dirction ;
    int speed=10;
    boolean alive=true;

    public  Bullet fire(){
        return new Bullet(x,y,dirction);

    }
    public Rectangle getRet() {
        return new Rectangle(x,y,heroimage.getWidth(new ImageOB()),heroimage.getHeight(new ImageOB()));
    }







}
