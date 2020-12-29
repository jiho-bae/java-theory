package chap11.ex04;

public class StringIndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "programming java";
		
		int location = subject.indexOf("java");
		System.out.println(location);
		
		if(subject.indexOf("java") != -1) {
			System.out.println("associated java");
		}
		else {
			System.out.println("non associated java");
		}
	}

}
