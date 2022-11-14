package day02.basic;

/*
[[기본 가료형]]
	2. 문자형(char)
	- 선언하는 방법
		char 변수명;
	- 전세계에서 쓰이는 문자 형태 대부분 표현가능.
*/
public class MainClass03 {
	public static void main(String[] args) {
		// char 형 변수 선언과 동시에 대입하기
		char ch1 = 'A';
		System.out.println("char 형 변수에 저장된 문자 : " + ch1);
		
		char ch2 = '朴'; /*캐릭터의 약자*/
		char ch3 = '쀍';
		
		int num = ch1; // char 형을 int 형으로 형변환
		System.out.println("대문자 A에 해당하는 숫자코드 : "+ num);
		
		int num2 = 110;
		char ch4 = (char)num2; // int 형을 char 형으로 강제 형변환
		System.out.println(ch4);
		
		// char는 2byte, int는 4byte
	}

}
