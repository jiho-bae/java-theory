package chap07.practice;

public class question5 {
	public String nation;
	
	public question5() {
		this("korea");
		System.out.println("parent() call");
	}
	
	public question5(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
