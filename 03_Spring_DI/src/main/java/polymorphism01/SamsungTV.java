package polymorphism01;

public class SamsungTV implements TV {
	private SonySpeaker speakerk;
	
	public SamsungTV() {
		System.out.println(">> SamsungTV 생성");
		//필드 SonySpeaker에 객체 주입
		speakerk = new SonySpeaker();
	}
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV - 전원OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV - 소리크게");
		speakerk.volumnUp();
	}
	public void volumnDown() {
		System.out.println("SamsungTV - 소리작게");
		speakerk.volumnDown();
	}
	
	//--------------------------------
	public void initMethod() {
		System.out.println("SamsungTV - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV - destroyMethod() 실행");
		
	}
}








