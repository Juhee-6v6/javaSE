package day09.thread;

import day09.mythread.MyThread;

/*
[[ Thread ]]

	메인메소드가 추가되서 같이 동작 한다고 생각하면 된다.
	병렬 실행
	비동기 실행

[[  새로운 스레드를 시작시키는 방법 ]]

	1. Thread 객체를 생성할 수 있는 클래스를 정의 한다.
	2. 정의한 클래스를 이용해서 객체를 생성
	3. 생성된 객체의 start() 메소드를 호출한다.
		! 주의 run() 메소드 호출아님 !

*/	
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		MyThread thread1 = new MyThread();
		thread1.start(); // 시작을 해야 병렬로 실행됨
		System.out.println("메인 스레드가 종료됩니다.");
	}

}
