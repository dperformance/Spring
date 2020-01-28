package polymorphism02;

public class TVUser {

	public static void main(String[] args) {
		//SamsungTV -> LgTV 변경사용
		TV tv = new LgTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
		
	

	}

}





