package chap12.ex03;

public class MusicRunnable extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Play music");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
