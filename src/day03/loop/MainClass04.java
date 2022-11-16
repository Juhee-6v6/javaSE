package day03.loop;

/*
for 반복문 연습
주말 숙제 2중 for문 분석하기

2번 숙제
	      *
	     **
  	    ***
	   ****
	  *****
	 ******
	*******
 	
 3번
       *
      ***
     *****
    *******

  4번
       *
      ***
     *****
    *******
     *****
      ***
       *
*/
public class MainClass04 {
	public static void main(String[] args) {
		System.out.print("개행하지 않아요!!\n");
		System.out.println("개행합니다..");
		System.out.println("개행확인");
		
		// 1번 숙제 분석!
		for(int i=0; i<7; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

}
