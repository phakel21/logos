package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new MyThread().start();

        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {

            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть число:");
            long a = sc.nextLong();
            long n0 = 1;
            long n1 = 1;
            long n2;

            System.out.println("Потік Thread: ");
            if (a == 1) {
                System.out.println(n0);
            } else if (a == 0) {
            } else if (a < 0) {
                System.out.println("Неправильний ввід");
            } else {
                System.out.print(n0);
                System.out.print(" " + n1);
            }
            for (long j = 3; j <= a; j++) {
                n2 = n0 + n1;
                System.out.print(" " + n2);
                n0 = n1;
                n1 = n2;
            }
        }

    }
}

class RunnableThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            List<Integer> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть число:");
            Integer a = sc.nextInt();
            Integer n0 = 1;
            Integer n1 = 1;
            Integer n2;

            System.out.println("Потік Runnable:");
            if (a == 1) {
                System.out.print(n0);
            } else if (a == 0) {
            } else if (a < 0) {
                System.out.print("Неправильний ввід");
            } else if (a == 2) {
                System.out.print(n0);
                System.out.print(" " + n1);
            } else {
                for (long c = 3; c <= a; c++) {
                    n2 = n0 + n1;
                    list.add(n2);
                    n0 = n1;
                    n1 = n2;
                }

                for (int j = list.size() - 1; j >= 0; j--) {
                    System.out.print(" " + list.get(j));
                }
                System.out.print(" 1");
                System.out.print(" 1");
            }
        }
    }
}