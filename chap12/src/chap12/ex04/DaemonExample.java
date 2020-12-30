package chap12.ex04;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try {	Thread.sleep(3000); } catch(InterruptedException e) {}
		
		System.out.println("end main thead,,");
	}

}
