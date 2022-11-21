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
		
		for(int i=0; i < 7; i++) {			/*바깥for 줄(행)*/
			for(int j=0; j < i+1; j++) {	/*안쪽for 칸(열)*/
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// 1번 숙제 분석!
		
//		 for(int i=0; i<7; i++) { 
//			 for(int j=0; j <= i; j++) { 
//				 System.out.print("*"); 
//				}
//		 	System.out.println(); 
//		  }
//		  
//		 System.out.println("2번 문제");
//		  
//		 for(int i=0; i<7; i++) { 
//			 for(int j=0; j < 6-i; j++) { 
//				 System.out.print(" ");
//		  	}
//		  
//		 	System.out.println("*"); 
//		 }
		 
		
	}

}
