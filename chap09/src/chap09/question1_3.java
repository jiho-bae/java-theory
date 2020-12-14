package chap09;

public class question1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1_2 anony = new question1_2();
		anony.field.start();
		anony.method1();
		anony.method2(
				new question1_1() {
					@Override
					public void start() {
						System.out.println("testing...");
					}
				});
	}

}
