import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Processor implements Runnable {
	
	private int id;

	public Processor(int id) {
		this.id = id;
	}

	public void run() { //what thread do
		System.out.println("Starting: "+id);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("Completed: "+id);
	}
}

public class ThreadPools {

	public static void main (String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3); //create thread pool instance (3 thread simultenaously)

		for(int i=0; i<5; i++) {
			executor.submit(new Processor(i));
		}

		executor.shutdown(); //shut thread pool

		System.out.println("All tasks submitted");

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
		}

		System.out.println("All tasks completed");
	}
}
