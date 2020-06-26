package J2HW1;

public class Robot implements Competitor {
    static int MAX_HEIGHT = 1;
    static int MAX_LENGTH = 50000;

    @Override
    public void run() {
        System.out.printf("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.printf("Робот прыгает");
    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (MAX_LENGTH >= o.getLENGTH());
        if (canRun) {
            System.out.println("Робот прошел дистанцию!");
        } else {
            System.out.println("Робот провалил дистанцию ...");
        }
        boolean canJump = (MAX_HEIGHT >= o.getHEIGHT());
        if (canJump) {
            System.out.println("Робот поднялся на вершину!");
        } else {
            System.out.println("Робот провалился на пике ...");
        }
        return canRun && canJump;
    }
}