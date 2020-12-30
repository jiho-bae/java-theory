package chap12.ex01;

import java.awt.Toolkit;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Thing");
			try {Thread.sleep(500);}catch(Exception e) {}
	}
	
	// setName, getName
	System.out.println("thread name : " + thread.getName());
	thread.setName("File_thread");
	System.out.println("thread name : " + thread.getName());
	}
}