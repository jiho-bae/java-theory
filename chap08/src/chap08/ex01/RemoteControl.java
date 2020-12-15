package chap08.ex01;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	// 인터페이스의 내부 구성요소 중 필드는 상수필드로, 메소드는 추상 메소드로 설정된다.
}
