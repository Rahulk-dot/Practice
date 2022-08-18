package thread;

public class Runabble1 implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread s= new Thread(new Runabble1());
		s.start();
		Thread t= new Thread(new Runabble1());
		t.start();
		Thread u= new Thread(new Runabble1());
		u.start();
		Thread v= new Thread(new Runabble1());
		v.start();
		Thread w= new Thread(new Runabble1());
		w.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello India");
		
	}

}
