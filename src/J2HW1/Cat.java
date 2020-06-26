package J2HW1;

public class Cat implements Competitor {
    static int MAX_HEIGHT = 2;
    static int MAX_LENGTH = 300;

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.printf("Кот прыгает");
    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (MAX_LENGTH >= o.getLENGTH());
        if (canRun) {
            System.out.println("Кот прошел дистанцию!");
        } else {
            System.out.println("Кот провалился на расстояние ...");
            return false;
        }
        boolean canJump = (MAX_HEIGHT >= o.getHEIGHT());
        if (canJump) {
            System.out.println("Кот поднялся на вершину!");
        } else {
            System.out.println("Кот провалился на пике ...");
        }
        return canRun && canJump;
    }
}