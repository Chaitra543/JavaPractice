package MultiThreading;

public class MyThread extends Thread {

	 public void run() {
		 System.out.println("execute run");
		 
	 }
	 
	 public static void main(String[] args) {
//		 MyThread mt = new MyThread();
//		 mt.start();
		 
		 
		 
		 MyRunnable mr = new MyRunnable();
		 Thread th = new Thread(mr);
		 th.start();
		 
		 System.out.println("main executed");
	 }
}
