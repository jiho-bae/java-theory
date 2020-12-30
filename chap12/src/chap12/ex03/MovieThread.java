package chap12.ex03;

public class MovieThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<3; i++) {
			System.out.println("play a media");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}	
