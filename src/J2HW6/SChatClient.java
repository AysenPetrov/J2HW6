package J2HW6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SChatClient {

    private static boolean isRunning = true;

    public static void run() {

        String SERVER_ADDR = "localhost";
        int SERVER_PORT = 8189;

        Socket sock = null;
        Scanner in;
        PrintWriter pw;

        try {
            sock = new Socket(SERVER_ADDR, SERVER_PORT);
            System.out.println("клиент работает");

            in = new Scanner(sock.getInputStream());
            pw = new PrintWriter(sock.getOutputStream());
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
            e.printStackTrace();
        } finally {
            try {
                sock.close();
                System.out.println("клиент закрыт");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}