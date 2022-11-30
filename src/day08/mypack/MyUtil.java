package day08.mypack;

public class MyUtil {
	
	public String name = "MyUtil";
	public static String staticName = "MyUtil";
	
	// 내부 클래스
	public class HelloPrinter{
		
		public void printerHello() {
			System.out.println(name + "의 내부 클래스 Helloprinter 입니다.");
			
			System.out.println("Hello~");
		}
	}
	
	// static 내부 클래스
	public static class Calculator{
		// 메소드
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println(staticName + "의 내부 클래스 Calculator");
			System.out.println(staticName + " 전달받은 두 정수의 합 : " + result);
		}
	}

}
