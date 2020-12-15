package chap08.ex02;

import chap08.ex01.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable sa = tv;
		
		rc.turnOn();
		sa.search("http://www.naver.com");
	}

}
