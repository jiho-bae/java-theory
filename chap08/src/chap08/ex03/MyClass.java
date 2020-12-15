package chap08.ex03;

import chap08.ex01.Audio;
import chap08.ex01.RemoteControl;
import chap08.ex01.Television;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass(){}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(2);
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	}
}
