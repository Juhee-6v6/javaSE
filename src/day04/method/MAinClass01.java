package day04.method;

import java.net.MulticastSocket;

/*
	[[ 메소드(method) ]]
	어떤 특정 작업을 수행하기 위한 명령문의 집합
	
	public 	static						 void 	hello		()
	접근제어자 (정적 - 쓸 수도 있고 안 쓸 수도 있음) 반환타입 메소드이름(매개변수타입, 매개변수명){	// 선언부
		명령문	// 구현부
		
		return 반환값;
	}
	
	오버로딩
		메소드 명이 같아도, 매게변수 갯수 또는 타입이 다르면 사용가능
	
*/
public class MAinClass01 {
	public static String name; // 전역변수 name 선언
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		
		
		// hello 메소드 호출하기
		hello();
		
		// printName 메소드 호출하기
		printName("박주희", 25);
		
		
		setName("피카츄");
		String strName = getName();
		System.out.println("전역변수 name : " + strName);
		
		String eMon = getEvolution("꼬부기");	//진화하는 메소드
		System.out.println(eMon);
	}
	
	// 인자(=매개변수) X 리턴 X -> 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, World");
	}
	
	// 인자(매개변수) O 리턴 X
	public static void printName(String name) {
		System.out.println("이름 : "+ name);
	}
	
	// 인자(매개변수) O 리턴 X , 매개변수 더 있는 거 : 오버로딩메소드
	public static void printName(String name, int age) {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}
	
	
	

	
	/**
	 * Alt + Shift + j
	 * 
	 * 포켓몬 진화 메소드
	 * 
	 * @param name
	 * @return
	 */
	// 인자(매개변수) O 리턴 X -> 매개변수 name에 대립
	public static void setName(String name) {
		// 전역변수 name과 지역변수 name
		MAinClass01.name = name;
	}
	
	// 인자(매개변수) O 리턴 X -> 전역변수 name을 반환한다.
	public static String getName() {
		return name;		// = MAinClass01.name
	}
	
	public static String getEvolution(String mon) {
		String eMon = "";
		if(mon.equals("꼬부기")) {
			eMon ="어니부기";
		}else if(mon.equals("어니부기")) {
			eMon = "거북왕";
		}
		
		return eMon;
	}
}



