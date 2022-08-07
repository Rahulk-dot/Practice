package thread;

public class MyRunnable implements Runnable{

	//This code prints the name of the current thread in the method run.

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj= new Thread(new MyRunnable());
		obj.start();

	}

}
