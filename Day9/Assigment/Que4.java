package Day9.Assigment;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class DeliveryTask implements Runnable {
    private final int orderId;

    public DeliveryTask(int id) {
        this.orderId = id;
    }

    @Override
    public void run() {
        String agentName = Thread.currentThread().getName();
        System.out.println("Order #" + orderId + " picked up by " + agentName);
        
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Order #" + orderId + " delivered by " + agentName + "!");
    }
}

public class Que4 {
    public static void main(String[] args) {
      
        ExecutorService deliveryPool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            deliveryPool.execute(new DeliveryTask(i));
        }

        deliveryPool.shutdown();
        try {
            if (!deliveryPool.awaitTermination(60, TimeUnit.SECONDS)) {
                deliveryPool.shutdownNow();
            }
        } catch (InterruptedException e) {
            deliveryPool.shutdownNow();
        }
        
        System.out.println("All orders processed for the day.");
    }
}

