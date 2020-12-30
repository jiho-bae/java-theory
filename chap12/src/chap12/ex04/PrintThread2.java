package chap12.ex04;

public class PrintThread2 extends Thread{

	public void run() {
		try {
			while(true) {
				System.out.println("executing");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {}

	
		// if you don't want to set "a temporary pause", use "break".
//		public void run() {
//			while(true) {
//				System.out.println("executing");
//				if(Thread.interrupted()) {
//					break;
//				}
//			}
//		}
		
		System.out.println("cleaning resources");
		System.out.println("end executing");
	}
}
