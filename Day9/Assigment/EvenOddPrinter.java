package Day9.Assigment;

public class EvenOddPrinter {
    private int counter = 1;
    private final int limit = 100;

    public synchronized void printOdd() {
        while (counter <= limit) {
            while (counter % 2 == 0) {
                try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
            if (counter <= limit) {
                System.out.println("Odd Thread: " + counter);
                counter++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (counter <= limit) {
            while (counter % 2 != 0) {
                try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
            if (counter <= limit) {
                System.out.println("Even Thread: " + counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();

        Thread t1 = new Thread(printer::printOdd);
        Thread t2 = new Thread(printer::printEven);

        t1.start();
        t2.start();
    }
}

