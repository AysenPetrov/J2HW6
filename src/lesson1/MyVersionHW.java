package lesson1;

public class MyVersionHW {
    public static void main(String[] args) {
        byte b = 12;
        short sh = 13 + 6;
        int width;
        width = 7;

        long megaDist = 1234567890L;
        megaDist = Long.MAX_VALUE;

        float radius = 12.5f;
        double pi = Math.PI;
        boolean flag = b <= sh;
        char symbol = '\u0044';
//        System.out.println(symbol);
//        System.out.println(someThink(1, 4, 5, 10));

//        printIsLeapYear(2001);
        printHelloForName("Vasia");

//        System.out.println(   inInterval(4,6)   );
    }

    //    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
    //    результат,где a, b, c, d – входные параметры этого метода;
    public static double someThink(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //    4. Написать метод, принимающий на вход два числа, и проверяющий что
    //    их сумма лежит в пределах от 10 до 20(включительно),
    //    если да – вернуть true, в противном случае – false;
    public static boolean inInterval(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    //    5. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль положительное ли число передали,
//    или отрицательное; Замечание: ноль считаем положительным числом.
    public static void printIsPositiveNumber(int n) {
        if (n >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //    6. Написать метод, которому в качестве параметра передается целое число,
//    метод должен вернуть true, если число отрицательное;
    public static boolean isNegativeNumber(int n) {
        return n < 0;
    }

    //    7. Написать метод, которому в качестве параметра передается строка,
//    обозначающая имя, метод должен вывести в консоль сообщение «Привет,
//    указанное_имя!»;
    public static void printHelloForName(String name) {
//        System.out.println("Привет, " + name + "!");
//        System.out.printf("Привет, %s !\n ", name);
        System.out.printf("Привет, %s !\n%s как дела?\n", name, name);

    }

//    8. * Написать метод, который определяет является ли год високосным,
//    и выводит сообщение в консоль. Каждый 4-й год является високосным,
//    кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void printIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printIsLeapYearV2(int year) {
        if (isLeapYear(year)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void printIsLeapYearV3(int year) {
        String prefix = "";
        if (!isLeapYear(year)) {
            prefix = "не ";
        }
        System.out.println("Год " + prefix + " является високосным");
//        System.out.printf("Год %sявляется високосным", prefix);
    }

    public static void printIsLeapYearV4(int year) {
        System.out.printf("Год %sявляется високосным", isLeapYear(year) ? "" : "не ");
    }

}
