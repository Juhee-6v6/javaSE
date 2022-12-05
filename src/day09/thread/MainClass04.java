package day09.thread;

/*
	synchronized - 동기화를 시켜주는 예약어
*/

import day09.mythread.Brother;
import day09.mythread.Sister;
import day09.mythread.Wallet;

public class MainClass04 {
	public static void main(String[] args) {
		// wallet 객체 생성하기
		Wallet wallet = new Wallet();
		
		//  Sister 스레드 객체 생성
		Sister sister = new Sister(wallet);
		
		// Brother 스레드 객체 생성
		Brother brother = new Brother(wallet);
		
		// 각각의 객체를 이용해서 두개읭 스레드 시작하기
		sister.start();
		brother.start();
		
		System.out.println("메인스레드가 종료됩니다.");
	}

}