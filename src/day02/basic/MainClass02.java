package day02.basic;
/*
 [[기본 자료형]]
		1. 논리형
		
- 선언 방법
	boolean 변수명
	
- 가질 수 있는 범위 : true, false 두가지 값 저장 가능
*/
	
public class MainClass02 {
	boolean isGlobal = true;
	
	public static void main(String[] args) {
		// 논리형 지역변수 선언하기
		boolean isWait;
		// 선언한 변수에 값 대입하기
		isWait = true;
		// 저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값 : "+isWait);
		
		// 지역 변수는 일반적으로 선언과 동시에 값을 넣어주어야 한다.
		boolean canRun = false; // 변수 선언과 동시에 값 대입
		
		// 변수에 저장된 값을 실행 도중에 바꿀 수 있다.
		isWait = false;
		canRun = true;
		
		// 줄복사 Ctrl + Art + 아래방향키
		System.out.println("isWait : " + isWait);
		System.out.println("canRun : " + canRun);
		
		// 한 줄 주석 단축키 : Ctrl + /
		boolean isArea; // 초기화 작업
		// System.out.println(isArea);
		
		
	}

}






