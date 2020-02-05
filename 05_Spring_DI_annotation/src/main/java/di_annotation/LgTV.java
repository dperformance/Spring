package di_annotation;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;


//객체 생성 요청을 하는 어노테이션 
//스프링 컨테이너가 실행 될 떄 xml을 참고 하여 객체 생성해줌 LgTV -> lgTV
@Component
public class LgTV implements TV {
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println(">> LgTV 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원 ON");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원 OFF");
		
	}
	@Override
	public void volumnUp() {
		System.out.println("LgTV - 소리 크게~~");
		speaker.volumnUp();
	}
	@Override
	public void volumnDown() {
		System.out.println("LgTV - 소리 작게~~");
		speaker.volumnDown();
	}

	//--------------------------------
	public void initMethod() {
		System.out.println("LgTV - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("LgTV - destroyMethod() 실행");
		
	}	
}
