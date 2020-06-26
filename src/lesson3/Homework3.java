package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("\nПривет, поиграем?" + "\nЯ загадал число от 0 до 9 попробуй угадай! \nПомни, у тебя 3 попытки.\n");

            int askInt = new Random().nextInt(10);

            int i;
            for (i = 1; i < 4; i++) {
                System.out.printf("Ваше число? #%d: ", i);
                int getInt = scanner.nextInt();
                if (askInt > getInt) {
                    System.out.println("Заданное число меньше загаданной.\n");
                } else if (askInt < getInt) {
                    System.out.println("Заданное число больше,загаданной.\n");
                } else {
                    System.out.println("\n### Вы угадали! Поздравляю! ###\n");
                    break;
                }
            }

            if (i == 4) {
                System.out.println("### Извини ,но ты проиграл! ###\n");
            }

            System.out.print("\n" + "Играть снова? 1 - Да/ 0 - Нет: ");

        } while (scanner.nextInt() == 1);

    }

}