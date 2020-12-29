package chap11.ex04;

public class StringSubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "701201-1234567";
		
		String firstNum = ssn.substring(0,6);
		String lastNum = ssn.substring(7);
		
		System.out.println("first num : " + firstNum);
		System.out.println("last num : " + lastNum);
	}

}
