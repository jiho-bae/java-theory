package chap06;

public class Korean {
	String nation = "Korea";
	String name;
	String ssn;
	
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String nation, String name, String ssn){
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}
}
