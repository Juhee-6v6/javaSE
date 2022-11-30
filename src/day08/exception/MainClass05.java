package day08.exception;

import day08.mypack.NumberPrinter;

/*
throw - 예외가 발생하면 상위 메소드로 예외를 던진다.
*/
public class MainClass05 {
	public static void main(String[] args) {
		NumberPrinter np = new NumberPrinter();
		
		try {
			np.printNunber();
		}catch (InterruptedException e) {
			System.out.println("인셉션 발생!");
		}
	}

}
