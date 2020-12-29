package chap11.ex02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("google", "Android");
		SmartPhone yourPhone = new SmartPhone("Apple", "Ios");
		
		String strobj = myPhone.toString();
		String strobj2 = yourPhone.toString();

		System.out.println(strobj);
		System.out.println(strobj2);
		
		System.out.println(myPhone);
		System.out.println(yourPhone);
	}

}
