package Class;

import java.awt.*;

public class Bullet {
    Image image = GetImage.getImage("Picture/bullet.jpg");
    int x;
    int y;
    String dirction;
    int speed = 50;

    public Bullet(int x, int y, String dirction) {
        this.x = x;
        this.y = y;
        this.dirction = dirction;
    }

    public void drawBullet(Graphics graphics){
        if(dirction.equals("UP")){
            graphics.drawImage(image,x,y-=speed,null);

        }
        if(dirction.equals("DOWN")){
            graphics.drawImage(image,x,y+=speed,null);

        } if(dirction.equals("LEFT")){
            graphics.drawImage(image,x-=speed,y,null);

        } if(dirction.equals("RIGHT")){
            graphics.drawImage(image,x+=speed,y,null);

        }
    }
    public Rectangle getRet() {
        return new Rectangle(x,y,image.getWidth(new ImageOB()),image.getHeight(new ImageOB()));
    }




}
