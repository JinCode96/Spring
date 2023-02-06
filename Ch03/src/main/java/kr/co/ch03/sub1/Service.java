package kr.co.ch03.sub1;

import org.springframework.stereotype.Component;

@Component // 컴포넌트 등록
public class Service {

	// 여기에 before가 위빙됨
	public void insert() {
		System.out.println("핵심 관심 - insert...");
	}
	// after 위빙됨
	
	
	public void select() {
		System.out.println("핵심 관심 - select...");
	}

	public void update() {
		System.out.println("핵심 관심 - update...");
	}
	
	public void delete() {
		System.out.println("핵심 관심 - delete...");
	}
	
}
