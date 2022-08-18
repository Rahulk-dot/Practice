
package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumberPool extends Thread{
	
	private int num ;
	public PrintNumberPool(int num){
		this.num = num;
		
	}
	
	public void run() {
		System.out.println(num);
		System.out.println(num+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumberPool taskA = new PrintNumberPool(1);
		PrintNumberPool taskB = new PrintNumberPool(3);
		PrintNumberPool taskC = new PrintNumberPool(5);
		PrintNumberPool taskD = new PrintNumberPool(7);
		PrintNumberPool taskE = new PrintNumberPool(9);
		
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		pool.execute(taskA);
		pool.execute(taskB);
		pool.execute(taskC);
		pool.execute(taskD);
		pool.execute(taskE);
		
		pool.shutdown();

	}

}
