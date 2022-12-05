package day09.mythread;


// Thread 객체를 만들려면
// Thread 객체 상속
public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread 만의 작업을 해요!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Thread.sleep(2000); 치고 sleep에 마우스 올리면 링크 뜨는거 누르면 됨
		
		System.out.println("MyThread 가 종료됩니다.");
	}

}
