//Third way to create threads
public class Watek3{
	public static void main(String[] args){
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("Watek "+i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();
	}
}
