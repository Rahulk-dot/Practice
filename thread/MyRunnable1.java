package thread;


//This code here illustrates two Threads running together.
//Two threads 
	//1. 'Exp 1 Thread' in run method.
	//2. 'Main Thread' in main method.
//In this code 'Thread.sleep(100)' is used to delay the particular thread's execution.
//It is used in both the thread so that they could execute simultaneously.

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
