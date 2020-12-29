package chap11.ex04;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "7012311234011";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("it is ssn. ");
		} else {
			System.out.println("its not ssn");
		}
	}

}
