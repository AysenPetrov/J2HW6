package lesson1;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello \"world\"!");
//        System.out.println("java");

//        int a = 10;
//        int b = 20;
//        int c = a + b;
//
//
//        System.out.println(a + " + " + b + " = " + c);
//        System.out.printf("%d + %d = %d\n", a, b, c);

//     byte  8 bit -128..127
//     short 16 bit -2^15 .. 2^15-1
//     int   32 bit -2^31 .. 2^31-1
//     long  64 bit -2^63 .. 2^63-1

//        byte b = 12;
//       b += 2;
////       b = (byte)(b + 2);
//       b-=4;
//       b*=6;
//       b/=2;

//        b %= 7;
//        int a = 13 % 4;
//        System.out.println(a);

//        long t = 1231231231456453645L;

//        float 32 bit
//        double  64 bit

//        float f = (float) 4.6;
//        float f1 =  4.6f;

//        char 16 bit

//        char c = 'R';
//        char c1 = 65;
//        char c2 = '\u12aa';
//
//        System.out.println(c2);

//        boolean b = true;
//        b = false;

//        String someWord = "Java";

//        final int VALUE_A = 5;
////        System.out.println(VALUE_A);


//        printHello();

//        printWord("Java");
//        printWord("Core");

//        printSum(3, 2);

//        printWord("Дискриминант");
//        System.out.println(disk(1, -5, 6));

//        System.out.println( sum(5,8) * sum(1,2) );

//        System.out.println(isEven(6));

//        int a = 6;
//
//        if (isEven(a)){
//            System.out.println("Четное");
//        } else {
//            System.out.println("Не четное");
//        }

//        double t = 69;
//
//        if (t >= 70){
//            System.out.println("Опасность!");
//        } else {
//            System.out.println("Работа в штатном режиме");
//        }


//        football(5, 10, 6);

        if (comfortTime(9)) {
            System.out.println("Норм");
        } else {
            System.out.println("Не подходит");
        }



    }

    public static boolean comfortTime(int t) {
        return (t >= 7 && t <= 10) || (t >= 17 && t <= 21);
    }


    public static void stateOfWater(double t) {
        if (t > 100) {
            System.out.println("Пар");
            return;
        }
        if (t >= 0 && t <= 100) {
            System.out.println("Вода");
            return;
        }
        if (t < 0) {
            System.out.println("Лед");
        }
    }


    public static void football(double a, double b, double x) {
        if (a < x && x < b) {
            System.out.println("Гол!");
        } else {
            System.out.println("Промазал...");
        }
    }


    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double disk(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void printSum(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }


    public static void printHello() {
        System.out.println("============");
        System.out.println("Hello");
        System.out.println("============");
    }

    public static void printWord(String word) {
        System.out.println("============");
        System.out.println(word);
        System.out.println(word);
        System.out.println("============");
    }


}
