package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static int x = 5;
    static Random random;

    public static void main(String[] args) {
//        printWord(3, "Hello");


//        for (byte i = 100; i > 0 ; i++) {
//            System.out.print(i+" ");
//        }

//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\n" + i);


//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("i= %d  j= %d\n", i, j);
//            }
//        }


//        printRectangle(7,7);

//        printMulti(19);

//        for (int i = 0, n = 100; i < n ; i++, n--) {
//            System.out.println(i+ " "+ n);
//        }

//        for (int i = 1; i <=1024 ; i*=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i > 0 ; i-=10) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 100 ; i+=5) {
//            System.out.println(i);
//        }

//        //бесконечнчый цикл
//        for ( ; ; ) {
//
//        }

        //вывести делители числа

//        int n = 6;
//        for (int i = 1; i <=n ; i++) {
//            if (n % i == 0){
//                System.out.print(i+ " ");
//            }
//        }

//        int x = 256;
//        while (x > 0) {
//            System.out.println(x);
//            x /= 2;
//        }

//        int x = 256454;
//        int k = 0;
//        while (x > 0) {
//            x /= 10;
//            k++;
//        }
//        System.out.println("k= "+ k);

        //бесконченый цикл
//        while(true){
//
//        }


//        int i = 19999;
//        int n = 10;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i < n);


//        for (int i = 0; i < 10; i++) {
//            if (i>=3 && i<=5){
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i>=3 && i<=5){
//                break;
//            }
//            System.out.println(i);
//        }

//        http://yandex.ru
////        for (int i = 0; i < 5; i++) {
////            for (int j = 0; j < 5; j++) {
////                if (j == 2) {
////                    break http;
////                }
////                System.out.printf("i= %d  j= %d\n", i, j);
////            }
////        }

//        exampleBreak();


//        int n = 1;
//        if(n==12 || n==1 || n==2){
//            System.out.println("winter");
//        }
//
//        if(n==3 || n==4 || n==5){
//            System.out.println("spring");
//        }

//        switch (n){
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("spring");
//                break;
//            default:
//                System.out.println("no season");
//        }

//        String s = "Настя";
//        switch (s){
//            case "Анастасия":
//            case "Настя":
//            case "Настенька":
//            case "Настюня":
//                System.out.println("Анастасия");
//                break;
//            default:
//                System.out.println("не найдено имя");
//        }


//        int[] arr = new int[5];
//        arr[3] = 6;


//        int[] arr = new int[]{3,1,6,4,7,7,2,3,1,4,3,2,5,67,5,6};
        ;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//        System.out.println(Arrays.toString(arr));


//        int[] a = {1, 2, 3};
//        int[] b = {4, 5, 6};
//
//
//        b = a;
//        b[1] = 99;
//        a[2] = 55;
//
//        System.out.println(Arrays.toString(a));


//        int[] arr = {3, 4, 2, 6, 2, 1, 7, 2, 8};
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arr[i] += 10;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));


//        random = new Random();
//
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10) + 10;
//        }
//
//        System.out.println(Arrays.toString(arr));


        String[][] words = {
                {"qwert", "asdsa","rtyr"},
                {"aaa","bbb"},
                {"zxz","zxczxczx","ere", "ere"}
        };

//        String[][] words1 = new String[2][2];
//        words1[0][0] ="java";


        printArr2d(words);

        System.out.println(words[1][0]);

    }

    static void printArr2d(String[][] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println();
        }
    }


    static void exampleBreak() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    return;
                }
                System.out.printf("i= %d  j= %d\n", i, j);
            }
        }
    }

    static void printMulti(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }


    static void printRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printWord(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}
