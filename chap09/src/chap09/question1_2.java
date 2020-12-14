package chap09;

public class question1_2 {
	question1_1 field = new question1_1() {
		@Override
		public void start(){
			System.out.println("Designing...");
		}
	};
	
	void method1() {
		question1_1 localVar = new question1_1() {
			@Override
			public void start() {
				System.out.println("Developing...");
			}
		};
		localVar.start();
	}
	
	void method2(question1_1 worker) {
		worker.start();
	}
}
