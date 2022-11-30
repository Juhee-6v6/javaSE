package day08.innerclass;

import day08.mypack.Soldier;
import day08.mypack.Weapon;


public class MainClass04 {
	public static void main(String[] args) {
		
			/*
			 * 1. Soldier 생성자 실행
			 * 2. 익명 클래스 (Weapon 상속받은 생성자 매게변수로 대입)
			 * 3. 매개변수로 받은 익명 클래스 Soldier 클래스
			 * 	  Weapon w 에 대입
			 * 4. 익명클래스 w의 attack 메소드 실행 호출
			 * 5. Soldier 생성자 종료
			 * 6. Soldier 객체 생성
			 */
		
		Soldier s = new Soldier(new Weapon() {
			@Override
			public void attack() {
				System.out.println("솔져 공격!");
			}
		});
		
		s.w.attack();
	}

}
