public class Homework {
        public static void main(String[] args) {
            /**
             * задание 1
             */
            // задание 1
            System.out.println("задание 1: method main is running");

            // задание 2
            printTypes();

            // задание 3
            if (calcExpr(2, 3, 10, 5) == 10) {
                System.out.println("задание 3: test passed. 2 * (3 + 10/5) == 10");
            }

            // задание 4
            if (isSumInRange(7, 8)) {
                System.out.println("задание 4: test passed. 10 <= (7 + 8) <= 20");
            }

            // задание 5
            System.out.print("задание 5: ");
            printPosOrNeg(-345);

            // задание 6
            if (isNegative(-1)) {
                System.out.println("задание 6: test passed. -1 is negative");
            }

            // задание 7
            System.out.print("задание 7: ");
            sayHello("Фанзиль");

            // задание 8
            System.out.println("задание 8: check year");
            int[] years = {200, 1600, 1700, 2016, 2017, 2020};
            for (int year : years) {
                System.out.print("  ");
                printIsLeapYear(year);
            }

        }

        /**
         * задание 2
         */
        public static void printTypes() {
            byte a = 13;      // -128..127
            short b = -32000; // -32768..32767
            int c = 483647;   // -2147483648..2147483647
            long d = 4_073_709_551_615L; // -18446744073709551616..18446744073709551615
            float e = 2.7f;
            double f = 3.14;
            char g = 'S';
            boolean h = true;

            System.out.printf("задание 2: a = %d, b = %d, c = %d, d = %d, e = %f, f = %f, g = %c, h = %b%n", a, b, c, d, e, f, g, h);
        }

        /**
         * задание 3
         */
        public static int calcExpr(int a, int b, int c, int d) {
            return a * (b + (c / d));
        }

        /**
         * задание 4
         */
        public static boolean isSumInRange(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }

        /**
         * задание 5
         */
        public static void printPosOrNeg(int a) {
            if (a >= 0) {
                System.out.printf("argument %d is positive%n", a);
            } else {
                System.out.printf("argument %d is negative%n", a);
            }
        }

        /**
         * задание 6
         */
        public static boolean isNegative(int a) {
            return a < 0;
        }

        /**
         * задание 7
         */
        public static void sayHello(String name) {
            System.out.println("Привет, " + name + "!");
        }

        /**
         * задание 8
         */
        public static void printIsLeapYear(int year) {
            if (year % 400 == 0) {
                System.out.printf("year %d is leap%n", year);
            } else if (year % 4 == 0 && year % 100 != 0) {
                System.out.printf("year %d is leap%n", year);
            } else {
                System.out.printf("year %d is NOT leap%n", year);
            }
        }

    }

