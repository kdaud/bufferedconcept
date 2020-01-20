package coding;


public class Master {
	
	public void myCode(Vehicles h) {
		if (h instanceof Wish) {
			Wish obj = (Wish) h;
			obj.showWish();
		}
		if (h instanceof Benz) {
			Benz obj = (Benz) h;
			obj.showBenz();
		}
		
	}
}
