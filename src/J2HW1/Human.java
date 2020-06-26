package J2HW1;

public class Human implements Competitor {
    static int MAX_HEIGHT = 2;
    static int MAX_LENGTH = 30000;

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (MAX_LENGTH >= o.getLENGTH());
        if (canRun) {
            System.out.println("Человек прошел расстояние!");
        } else {
            System.out.println("Человек провалил расстояние ...");
        }
        boolean canJump = (MAX_HEIGHT >= o.getHEIGHT());
        if (canJump) {
            System.out.println("Человек поднялся на вершину!");
        } else {
            System.out.println("Человек провалился на пике ...");
        }
        return canRun && canJump;
    }
}