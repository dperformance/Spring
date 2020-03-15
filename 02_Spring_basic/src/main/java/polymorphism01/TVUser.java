package polymorphism01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	
	public static void main(String[] args) {
		//1. 스프링 컨테이너 구동(스프링설정파일 읽어서)
		AbstractApplicationContext factory 
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. 스프링컨테이너에 생성된 객체 요청(Lookup)
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
		
		System.out.println("\n---- tv 요청 -----");
		tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
		
		//3. 스프링컨테이너 종료(close)
		factory.close();
		
	}
}
		
		
