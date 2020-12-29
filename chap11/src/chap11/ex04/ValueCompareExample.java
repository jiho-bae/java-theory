package chap11.ex04;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == != 의 비교보다는, equals를 이용하는 비교가 더 좋다.
		System.out.println(" if value <-128 || value >127");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(" == result : " + (obj1 == obj2));
		System.out.println("after UnBoxing, == result : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals result :  " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("if -128 < value < 127");
		Integer obj11 = 100;
		Integer obj22 = 100;
		System.out.println("== result : " + (obj11 == obj22));
		System.out.println("after UnBoxing, == result : " + (obj11.intValue() == obj22.intValue()));
		System.out.println("equals result : " + obj11.equals(obj22));
		System.out.println();
		
	}

}
