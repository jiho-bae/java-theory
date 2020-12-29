package chap11.ex03;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(0);
			}
			System.out.println("now i = "+ i);
		}
		System.out.println("finish code.");
	}

}
