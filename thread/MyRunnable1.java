package thread;

public class MyRunnable1 implements Runnable{
	
	public static int myCount = 0;
	public MyRunnable1() {
		
	}
	public void run() {
		while(MyRunnable1.myCount <= 10) {
			try {
				System.out.println("Exp 1 Thread:"+(++MyRunnable1.myCount));
				Thread.sleep(100);
			}
			catch(InterruptedException iex){
				System.out.println("Exception in Thread:"+iex.getMessage());
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main Thread...");
		Thread obj = new Thread(new MyRunnable1());
		obj.start();
		while(MyRunnable1.myCount <= 10) {
			try {
				System.out.println("Main Thread:"+(++MyRunnable1.myCount));
				Thread.sleep(100);
			}
			catch(InterruptedException iex) {
				System.out.println("Exception in Main Thread: "+iex.getMessage());
			}
		}
		System.out.println("End of Main Frame.....");

	}

}
