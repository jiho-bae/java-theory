package chap11.ex03;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i=1; i<=100000; i++) {
			sum +=i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("Sum 1~100000 : "+ sum);
		System.out.println("process time : " + (time2-time1) + " nano time");
	}

}
