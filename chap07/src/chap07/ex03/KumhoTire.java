package chap07.ex03;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire life : " + (maxRotation - accumulatedRotation)+ " 회");
			return true;
		}
		else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
