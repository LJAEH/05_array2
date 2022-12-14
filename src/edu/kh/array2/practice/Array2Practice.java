package edu.kh.array2.practice;

public class Array2Practice {
	
	public void practice1() {
		
		int[][] arr = new int[3][3];
		
		for(int row =0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = col;
				
				System.out.print("("+row+", "+col+")");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		/*4행 4열짜리 정수형 배열을 선언 및 할당하고
		1) 1 ~ 16까지 값을 차례대로 저장하세요.
		2) 저장된 값들을 차례대로 출력하세요.

		[실행 화면]
		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16
		*/
		
		int[][] arr = new int[4][4];
		int a = 1;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = a;
				System.out.print(arr[row][col] + " ");
				a++;
			}
			System.out.println();
		}
		
	}
	
	public void practice3() {
		
		/* 4행 4열짜리 정수형 배열을 선언 및 할당하고
		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		2) 저장된 값들을 차례대로 출력하세요.

		[실행 화면]
		16 15 14 13
		12 11 10 9
		8 7 6 5
		4 3 2 1
		*/
		
		int[][] arr = new int[4][4];
		int a = 16;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = a;
				System.out.print(arr[row][col] + " ");
				a--;
			}
			System.out.println();
		}
		
		
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		int random = (int)Math.random()*10+1;
		
		int total = 0;
		
		// 2행 2열까지 난수 값 저장
		
		for(int row = 0; row < arr.length-1; row++) {
			
			for( int col = 0; col < arr[row].length-1; col++) {
				arr[row][col] = random;	
			}
		}
		
		// 3열에 행의 합 저장
		
		
		for(int row = 0; row < arr.length; row++) {

			int rowsum = 0;
			
			for (int col = 0; col < arr[row].length; col++) {
				rowsum += arr[row][col];
			}
			arr[row][arr.length] = rowsum;
		}
		
		// 3행에 열의 합 저장
		
		for(int col = 0; col < arr.length; col++) {

			int colsum = 0;
			
			for (int row = 0; row < arr[row].length; row++) {
				colsum += arr[row][col];
			}
			
			total += colsum;
			
			arr[arr.length][col] = colsum;
			
		}
		
		// 총합
		
		arr[4][4] = total;
		
		// 출력
		
		for(int row = 0; row < arr.length; row++) {
			for( int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
