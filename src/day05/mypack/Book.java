package day05.mypack;

public class Book {
	public String subject = "JAVA Programing";
	public String writter = "박주희";
	
	public void read() {
		int page = 10;
		System.out.println(subject + " "+ page +" 페이지 읽어요!");
	}
	
	public void pillow() {
		System.out.println("페이지 베개로 사용해요!"); // page 사용 못함 지역변수라서.
	}
	
	
}
