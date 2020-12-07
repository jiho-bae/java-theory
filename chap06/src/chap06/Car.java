package chap06;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("no have gas");
			return false;
		}
		System.out.println("have gas");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("run. gas : "+ gas);
				gas--;
			}
			else {
				System.out.println("stop. gas : "+ gas);
				return;
			}
		}
	}
}
