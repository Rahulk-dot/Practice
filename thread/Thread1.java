package thread;

public class Thread1 extends Thread{
	public void run() {
		System.out.println("Hello All");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t = new Thread1();
		t.start();
		Thread1 u = new Thread1();
		u.start();
		Thread1 v = new Thread1();
		v.start();
		Thread1 w = new Thread1();
		w.start();
		Thread1 x = new Thread1();
		x.start();
		

	}

}
