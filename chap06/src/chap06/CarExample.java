package chap06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(10);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("Start");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("dont have to inject gas");
		}
		else {
			System.out.println("please inject gas");
		}
	}

}
