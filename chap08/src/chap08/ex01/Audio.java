package chap08.ex01;

public class Audio implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("turn on Audio");
	}
	
	public void turnOff() {
		System.out.println("turn off Audio");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Audio volume : " + this.volume);
	}
	// 인터페이스의 메소드는 public 접근권한을 가지므로 구현 클래스에서 public보다 더 낮은 접근을 가질 수 없다(public으로만 선언해야 한다).
}
