package Class;

import javax.swing.*;
import java.awt.*;

public class PaintThread extends Thread {
    GameJFrame jFrame;
    Graphics g;

    public PaintThread(GameJFrame jFrame) {
        this.jFrame = jFrame;

    }

    @Override
    public void run() {
        super.run();
        while (true) {
            jFrame.repaint();


            for (int i = 0; i < jFrame.enemies.size(); i++) {
                if (jFrame.enemies.get(i).alive) {
                    for (int j = 0; j < jFrame.bullets.size(); j++) {
                        if (jFrame.bullets.get(j).getRet().intersects(jFrame.enemies.get(i).getRet())) {
                            System.out.println("8");
                            jFrame.enemies.get(i).alive = false;
                            for (int k = 0; k < jFrame.enemies.size(); k++) {
                                System.out.println(jFrame.enemies.get(k).alive);
                            }
                            jFrame.score += 100;
                            jFrame.hero.kill++;
                            if (jFrame.enemies.get(i).getRet().intersects(jFrame.hero.getRet())) {
                                jFrame.hero.alive = false;
                            }

                        }
                    }
                }

            }

            if ((jFrame.victory || jFrame.defeat) && jFrame.counter == 0) {
                jFrame.counter++;
                jFrame.button3 = new JButton("再来一次");
                jFrame.button2 = new JButton("结束游戏");
                jFrame.button3.setBounds(300, 200, 200, 100);
                jFrame.button2.setBounds(300, 350, 200, 100);
                jFrame.button3.addActionListener(new AgainActionListener(this.jFrame));
                jFrame.button2.addActionListener(new CloseActionLister());
                jFrame.add(jFrame.button3);
                jFrame.add(jFrame.button2);

                System.out.println("112");

            }


            try {
                sleep(40);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
