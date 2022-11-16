package day02.basic;
/*
	[[ 참조형 데이터형(레퍼런스형) ]]
	
	5. String 형 (문자열)
	 - 선언하는 방법
	 	String 변수명;
	 - 문자열을 저장 할 수 있다.
	 
	기본형 - boolean, char, byte, short, int, long, float, double
	참조형
*/

public class MainClass07 {
	public static void main(String[] args) {
		char ch ='A';
		char[] ch1 = {'H', 'E'};
		
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요.";
		System.out.println("str : " + str);
		/*
		 * h e l l o 
		 * 0 1 2 3 4 => 인덱스 번호
		 */
		String hello = "hello";
		System.out.println("1번 인덱스 : "+ hello.charAt(1));
		
		String addr = "서울 특별시 서대문구 신촌"; //true
		boolean isContent = addr.contains("특별시"); //false
		if(isContent) { /*true면 실행*/
			System.out.println("addr 에는 특별시 라는 문자열이 있어요!");
		}
		
	}

}
