package day09.mythread;

public class Brother extends Thread {
	public Wallet wallet;	// 지갑 객체
	public int money;		// 인출한 돈을 저장 할 변수
	
	public Brother(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) {
			// 지갑에서 돈을 인출해서 저장한다.
			int returndMoney = wallet.getMoney(); // 변수에 누적됨
			if(returndMoney == 0) // 지갑 잔고가 0이면
				break;
			
			money = money + returndMoney;
			
		}
		
		System.out.println("Brother 총 재산 : "+money);
		
	}

}
