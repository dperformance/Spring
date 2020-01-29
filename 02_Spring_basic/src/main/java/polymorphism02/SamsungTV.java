package polymorphism02;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println(">> SamsungTV 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV - 전원OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV - 소리크게");
	}
	public void volumnDown() {
		System.out.println("SamsungTV - 소리작게");
	}
	
	//--------------------------------
	public void initMethod() {
		System.out.println("SamsungTV - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV - destroyMethod() 실행");
		
	}
}








