package chap08.ex04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("---------------");
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.backRightTire = new HankookTire();
		myCar.run();
	}

}
