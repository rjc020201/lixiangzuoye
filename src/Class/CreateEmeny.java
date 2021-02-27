package Class;

import java.util.Random;

public class CreateEmeny extends Thread {
    GameJFrame gameJFrame;
    int offset_x;
    int offset_y;
    int counter = 0;
     static int number = 6;
    Random random = new Random();

    public CreateEmeny(GameJFrame gameJFrame) {
        this.gameJFrame = gameJFrame;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            offset_x = 400+random.nextInt(20);
            offset_y = 400+random.nextInt(20);
            counter++;

            if (counter % 2 == 0) {
                Enemy enemy = new Enemy(gameJFrame.hero.x + offset_x,gameJFrame.hero.y + offset_y);
                gameJFrame.enemies.add(enemy);
            }else {
                Enemy enemy = new Enemy(gameJFrame.hero.x - offset_x,gameJFrame.hero.y - offset_y);
                gameJFrame.enemies.add(enemy);
            }
            if(counter == number){
                break;
            }
            try{
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }




        }

    }
}
