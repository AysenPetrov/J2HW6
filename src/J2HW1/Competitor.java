package J2HW1;

public interface Competitor {
    int MAX_HEIGHT = 0;
    int MAX_LENGTH = 0;

    void run();
    void jump();
    boolean canPass(Obstacle o);
}