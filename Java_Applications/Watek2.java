//Second way to creat threads (implements interface Runnable)
class Runner implements Runnable {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Watek "+i);
		
			try{
				Thread.sleep(2000); //miliseconds
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Watek2 {
	public static void main(String[] args){
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());

		t1.start();
		t2.start();
	}
}
