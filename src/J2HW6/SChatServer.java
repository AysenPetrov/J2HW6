package J2HW6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SChatServer {

    private static boolean isRunning = true;

    public static void run() {
        ServerSocket serv = null;
        Socket sock = null;
        try {
            // listen port 8189
            serv = new ServerSocket(8189);
            System.out.println("сервер работает");


            sock = serv.accept();
            System.out.println("клиент подключен");

            Scanner in = new Scanner(sock.getInputStream());
            PrintWriter pw = new PrintWriter(sock.getOutputStream());
            Scanner console = new Scanner(System.in);

            Thread ct = new Thread(new Runnable() {
                @Override
                public void run() {
                    String msg;
                    try {
                        while (true) {
                            msg = console.nextLine();
                            pw.println(msg);
                            pw.flush();
                            if (msg.equals("конец")) {
                                isRunning = false;
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }
            });
            ct.start();

            while (isRunning) {
                if (in.hasNext()) {
                    String msg = in.nextLine();
                    if (msg.equalsIgnoreCase("конец")) {
                        ct.stop();
                        break;
                    }
                    System.out.println(msg);
                }
            }

        } catch (IOException e) {
            System.out.println("[error] Ошибка инициализации сервера");
        } finally {
            try {
                serv.close();
                System.out.println("сервер остановлен");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}