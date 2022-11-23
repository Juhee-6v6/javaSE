package day05.oop;

// 컨트롤 + 엔터 : 자동으로 import 됨
// 컨트롤 + 쉬프트 + o : 한번에 여러개 import
import day05.mypack.MathUtil;

public class MainClass03 {
	public static void main(String[] args) {
		// 반지름
		int r = 5;
		
		
		MathUtil mu = new MathUtil();
		mu.getArea(r);
		
		double area = mu.getArea(r);
		
		System.out.println("원의 넓이는 : " + area);
		
		// 두 수 합계
		int result = mu.sum(6, 4);
		System.out.println("6 + 4 = " + result);
		
		// 3개 합계
		System.out.println("5 + 9 + 1 = " + mu.sum(5, 9, 1));
		
		
		// 운영체제, 출력에 println를 사용함
	}
	

}
