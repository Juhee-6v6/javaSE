package day09.mythread;

public class Wallet { // 이 Wallet이 this임
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	// Thread safe 메소드
	public synchronized int getMoney() { // 메소드 호출
		if(totalMoney == 0) 
			return 0;
		
		totalMoney = totalMoney -1;
		System.out.println("현재 지갑의 금액 : "+ totalMoney);
		return 1;
	}

}
