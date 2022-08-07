package thread;

public class MyThread extends Thread{
	
	//This code prints the name of the current thread in the method run.
	
	public void run() {
		System.out.println(MyThread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread obj = new MyThread();
		obj.start();

	}

}
