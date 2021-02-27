package Class;

public class GameMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        GameJFrame jFrame = new GameJFrame(hero);

        new PaintThread(jFrame).start();
        new CreateEmeny(jFrame).start();



    }
}
