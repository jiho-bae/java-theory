package chap06;

public class Calulator {
	int plus(int[] arr1) {
		int sum=0;
		for(int arrs : arr1) {
			sum +=arrs;
		}
		return sum;
	}
	
	double avg(int[] arr1) {
		double sum = plus(arr1);
		double result = sum/arr1.length;
		return result;
	}
	
	void execute() {
		double result = avg(new int[] {7,10});
		println("실행 결과 :"+ result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
