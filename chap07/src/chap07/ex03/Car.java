package chap07.ex03;

public class Car {
	Tire frontLeftTire = new Tire("front left", 6);
	Tire frontRightTire = new Tire("front right", 2);
	Tire backLeftTire = new Tire("back left", 3);
	Tire backRightTire = new Tire("back right", 4);
	
	int run() {
		System.out.println("[Car is driving]");
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[Stopped Car]");
	}
}
