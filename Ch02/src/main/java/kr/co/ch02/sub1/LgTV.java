package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV {
	
	// 참조변수 선언. 초기화해줘야 호출가능
	// private Speaker spk; 이것은 null
	// 컨테이너에서 가져와서 주입시킨다
	
	// 이걸로 초기화 시킴
	@Autowired 
	private Speaker spk;
	
	
	public void powerOn() {
		System.out.println("LgTV powerOn...");
	}
	
	public void powerOff() {
		System.out.println("LgTV powerOff...");
	}
	
	public void soundUp() {
		//System.out.println("LgTV soundUp...");
		spk.soundUp();
	}
	
	public void soundDown() {
		//System.out.println("LgTV soundDown...");
		spk.soundDown();
	}
	
	

}
