package chap10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("need Execution index");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("Not available converting number format");
		}
		finally {
			System.out.println("reexecute");
		}
	}

}
