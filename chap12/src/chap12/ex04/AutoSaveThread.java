package chap12.ex04;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("save all.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {Thread.sleep(1000);} catch(InterruptedException e) {break;}
			save();
		}
	}
}
