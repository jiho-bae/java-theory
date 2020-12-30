package chap12.ex01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<10; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		});
		thread.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("Ding");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
