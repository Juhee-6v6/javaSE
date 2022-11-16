package day03.loop;
/*
[[ 반복문 ]]

특정 부분의 코드가 반복적으로 수행하도록 하는 제어문.

1. while 문
while(조건문) {
	반복 수행할 코드
}
*/

public class MainClass01 {
	public static void main(String[] args) {
		// while 문을 이용해서 0 ~ 99 까지 출력
		int count = 0; // 카운트 세기위한 변수
		while(true) {
			System.out.println(count);
			count++;
			if(count == 100) break; /*break는 반복문을 멈춘다.*/
		}
		//if문 컴퓨터의 리소스를 많이 잡아먹음
		
		count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;
		}
		
		// while문 안에 if문은 조건을 변수로 놓아야 할 경우 사용
		count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			count++;
			if(count == 100)isRun = false;
		}
	}

}
