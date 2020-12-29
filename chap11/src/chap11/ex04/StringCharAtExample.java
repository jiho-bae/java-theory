package chap11.ex04;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "950101-1253413";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("man");
			break;
		case '2':
		case '4':
			System.out.println("woman");
			break;
		}
	}

}
