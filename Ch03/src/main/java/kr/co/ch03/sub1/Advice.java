package kr.co.ch03.sub1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // 선언해줘야함
@Component
public class Advice { // 부가기능을 가지는 클래스
	
	// before()가 호출된다. (위빙, 짜집기됨)
	@Pointcut("execution(* kr.co.ch03..Service.*(..))") // 메서드 시그니처가 들어감. *(모든 반환타입), 패키지 클래스 메서드 이름, .. (모든 매개변수, 여러개 있어도 됨)
	public void beforePointcut() {} // 내용이 없는 메서드

	@Pointcut("execution(* kr.co.ch03..Service.*(..))") // select* select로 시작되는 모든 메서드
	public void afterPointcut() {}
	
	
	
	@Before("beforePointcut()")
	public void before() {
		System.out.println("횡단관심 - before...");
	}
	
	@After("afterPointcut()")
	public void after() {
		System.out.println("횡단관심 - after...");
	}
	
	
	
	
	
}
