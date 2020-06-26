package J2HW4;
import javax.swing.*;
public class HomeWork4 {

    public static void main(String[] args) {

        //нужна для работы в потоке интерфейса + анонимный класс
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWindow();
            }
        });
    }
}