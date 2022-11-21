package day04.array;
/*
	2중 배열
*/

public class MainClass04 {
	public static void main(String[] args) {
		
		int[][] nums = new int [4][3];
		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[0][2] = 3;
		nums[1][0] = 4;
		nums[1][1] = 5;
		nums[1][2] = 6;
		nums[2][0] = 7;
		nums[2][1] = 8;
		nums[2][2] = 9;
		nums[3][0] = 10;
		nums[3][1] = 11;
		nums[3][2] = 12;
		// 횡렬과도 같음
		// for 문 이용해서 출력하기
		
//		1 2 3
//		4 5 6
//		7 8 9
//		101112
		// 이 모양으로
		
		// 2중 배열 출력하기
		for(int i=0; i < nums.length; i++) {						//4줄
			for (int j=0; j<nums[1].length; j++) {					//3열
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n같은 값▼\n");
		
		for(int i=0; i < 4; i++) {						//4줄
			for (int j=0; j<3; j++) {					//3열
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
