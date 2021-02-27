package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GameJFrame extends JFrame implements ActionListener {

    Image background = GetImage.getImage("Picture/sekiro.jpg");
    Image curtain = GetImage.getImage("Picture/curtain.jpg");
    Image button = GetImage.getImage("Picture/beginbutton.png");
    Image offScreenImage = null;

    Container container;
    Hero hero;
    JButton button1,button2,button3;
    int counter = 0;

    int score = 0;
    boolean victory = false;
    boolean defeat = false;
    boolean begin = false;

    ArrayList<Bullet> bullets = new ArrayList<Bullet>();
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();

    Font f = new Font("宋体", Font.BOLD, 50);
    ImageIcon imageAdapter = new ImageIcon();
    ImageIcon imageAdapter1 = new ImageIcon();




    public GameJFrame() {
        this.setTitle("Room");
        this.setVisible(true);
        this.setSize(800, 800);
        this.setLocation(0, 0);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

    public GameJFrame(Hero hero) {
        this.hero = hero;
        this.setTitle("Room");
        this.setVisible(true);
        this.setSize(800, 600);
        this.setLocation(0, 0);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            //重写方法
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });
        imageAdapter1.setImage(button);
        button1 = new JButton(imageAdapter1);
        Container container = this.getContentPane();
        button1.addActionListener(this);
        button1.setBounds(0,0,800,800);
        container.add(button1);


        this.addKeyListener(new KeyE(this));
       this.addComponentListener(new ComponentE(this) );
    }






    @Override
    public void paint(Graphics g) {

        g.setFont(f);

       if(!victory&&!defeat) {


           if (begin) {

               g.drawImage(background, 0, 0, null);

               if (hero.alive) {
                   g.drawImage(hero.heroimage, hero.x, hero.y, null);
               }

               for (int i = 0; i < bullets.size(); i++) {
                   Bullet bullet = bullets.get(i);
                   bullet.drawBullet(g);
               }

               for (int i = 0; i < enemies.size(); i++) {
                   if (enemies.get(i).alive) {
                       g.drawImage(enemies.get(i).enemyimage, enemies.get(i).x, enemies.get(i).y, null);
                       enemies.get(i).move(this);
                   }

               }

               if (hero.kill == CreateEmeny.number) {
                   g.drawString("胜利", (int) (0.5 * this.getWidth()), (int) (0.5 * this.getHeight()));
                   victory = true;


               }
               if (!hero.alive) {
                   defeat = true;
                   g.drawString("失败", (int) (0.5 * this.getWidth()), (int) (0.5 * this.getHeight()));
               }
           }
       } else{
           this.setBackground(Color.gray);
       }
    }


    @Override

    public void update(Graphics g) {
        if (offScreenImage == null)
            offScreenImage = this.createImage(600, 800);     //新建一个图像缓存空间,这里图像大小为800*600
        Graphics gImage = offScreenImage.getGraphics();  //把它的画笔拿过来,给gImage保存着
        paint(gImage);//将要画的东西画到图像缓存空间去
        System.out.println("1");
        g.drawImage(offScreenImage, 0, 0, null);         //然后一次性显示出来
    }


    @Override
    public void actionPerformed(ActionEvent e) {

            begin = true;
            this.setFocusable(true);
            System.out.println("11");
            button1.setFocusable(false);
            this.remove(button1);




    }
}
