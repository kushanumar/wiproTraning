package Day9.Assigment;

public class SequencePrinter {
    private int state = 0; 
    private final int iterations = 10; 

    public synchronized void printLetter(String letter, int targetState) {
        for (int i = 0; i < iterations; i++) {
            while (state != targetState) {
                try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
            
            System.out.print(letter);
            
           
            state = (state + 1) % 3;
            notifyAll();
        }
    }

    public static void main(String[] args) {
        SequencePrinter printer = new SequencePrinter();

        Thread tA = new Thread(() -> printer.printLetter("A", 0));
        Thread tB = new Thread(() -> printer.printLetter("B", 1));
        Thread tC = new Thread(() -> printer.printLetter("C", 2));

        tA.start();
        tB.start();
        tC.start();
    }
}
