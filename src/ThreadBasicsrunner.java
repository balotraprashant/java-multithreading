public class ThreadBasicsrunner {
}

class Task1 extends Thread {
    public void run() {
        System.out.println("\nTask one started");

        for(int i=101; i<=199; i++) System.out.print(i + " ");

        System.out.println("\nTask one done");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\nTask two started");

        for(int i=101; i<=199; i++) System.out.print(i + " ");

        System.out.println("\nTask two done");
    }
}
