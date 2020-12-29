package chap11.ex04;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("James");
		String strVar2 = "James";
		
		if(strVar1 == strVar2) {
			System.out.println("reference same object.");
		} else {
			System.out.println("reference different object.");
		}
		
		if(strVar1.equals(strVar2)){
			System.out.println("have the same string.");
		} else {
			System.out.println("have the different string");
		}
	}

}
