package chap11.ex05;

public class MathRandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val1 = Math.random();
		int val_1 = (int)val1;
		System.out.println(val1);
		System.out.println(val_1);
		System.out.println();
		
		int over_6 = 0;
		int less_than_6 = 0;
		for (int i=0; i<1000 ; i++) {
			double val2 = Math.random()*6;
			int val_2 = (int)val2 + 1;
			if(val_2 > 6) {
				over_6 ++;
			} else if(val_2<= 6 && val_2 >=1) {
				less_than_6++;
			}
			
		}
		System.out.println("over 6 : " + over_6);
		System.out.println("less than 6 : " + less_than_6);
}
}