package chap07.ex03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i=1; i<15; i++) {
			int problemLocation = car.run();
		
		
			switch(problemLocation) {
			case 1:
				System.out.println("front left -> change HankookTire");
				car.frontLeftTire = new HankookTire("front left", 15);
				break;
			case 2:
				System.out.println("front right -> change KumhoTire");
				car.frontRightTire = new KumhoTire("front right", 13);
				break;
			case 3:
				System.out.println("back left -> change HankookTire");
				car.backLeftTire = new HankookTire("back left", 14);
				break;
			case 4:
				System.out.println("back right -> change KumhoTire");
				car.backRightTire = new KumhoTire("back right", 16);
				break;
			}
		System.out.println("---------------------------------");
		}
		}

}
