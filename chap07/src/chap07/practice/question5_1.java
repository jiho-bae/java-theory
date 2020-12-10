package chap07.practice;

public class question5_1 extends question5{
	private String name;
	
	public question5_1() {
		this("hgd");
		System.out.println("Child() call");
		
	}
	
	public question5_1(String name) {
		this.name = name;
		System.out.println("Child(string name) call");
	}

	public String getName() {
		return name;
	}

	
	
}
