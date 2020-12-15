package chap08.ex01;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(2);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(11);
		rc.setVolume(-150);
		rc.setVolume(5);
		rc.turnOff();
	}

}
