package day08.mypack;

public class Soldier {
	public Weapon w; // = new Weapon 임 클래스라고 치면
	
	// 생성자 객체 생성 직전 실행 - 초기화용으로 사용
	public Soldier(Weapon w) {
		this.w = w;
		w.attack(); //s.w.attack(); 랑 같음
		
		System.out.println(System.identityHashCode(w)); // 주소값 동일 확인
	}

}
