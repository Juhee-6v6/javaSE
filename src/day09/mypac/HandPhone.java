package day09.mypac;

public class HandPhone {
	public String model;	// 전역 변수 초기화 하지 않으면 
							// null
	
	static{
		System.out.println("static 초기화 블럭");
	}// 실행하자마자 메모리에 올라감
	
	{
		System.out.println("초기화 블럭");
	}// 실행할 때마다 실행됨
	
	// 생성자 - 클래스명과 동일하다.
	public HandPhone() {
		this.model = "갤럭시";
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}// 제일 마지막에 실행됨
	
	// 오버로딩 생성자
	public HandPhone(String model) {
		this.model = model;
		System.out.println("생성자로 " + model + "이 전달되었습니다.");
	}

}
