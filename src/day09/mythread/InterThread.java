package day09.mythread;

public class InterThread implements Runnable { // implements는 다중 상속이 가능하다.

	@Override
	public void run() {
		System.out.println("InterThread 가 시작되었습니다.");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("InterThread가 종료됩니다.");
	}

}
