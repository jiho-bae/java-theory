package chap12.ex04;

public class PrintThread1 extends Thread{
	private boolean stop;
	private int count;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("executing" + (count++));
		}
		System.out.println("cleaning resources..");
		System.out.println("end executing");
	}
}
