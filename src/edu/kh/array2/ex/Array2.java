package edu.kh.array2.ex;


import java.util.Arrays;


import java.util.Scanner;



public class Array2 {
	
	/* 2차원 배열
	 * 
	 * - 자료형이 같은 1차원배열을 묶음으로 다루는 것
	 * -> 행, 열 개념 추가
	 * 
	 * 
	 */

	public void ex1() {
		
		// 2차원 배열 선언
		int[][] arr;
		// int 2차원 배열을 참조하는 참조변수 선언
		// == int arr[][]
		// == int[] arr[]
		// note! (참조형 == 참조 변수 == 레퍼런스 변수 == 레퍼런스)
		
		// 2차원 배열 할당
		// -> new 자료형 [행크기][열크기]
		
		arr = new int[2][3];
		
		// heap 영역에 int 2차원 배열 2행 3열 공간을 할당
		
		// 2차원 배열 초기화
		// 1) 행,열 인덱스를 이용해서 직접 초기화
		
		/*
		arr[0][0] = 10;
		arr[0][1] = 100;
		arr[0][2] = 500;
		
		arr[1][0] = 20;
		arr[1][1] = 200;
		arr[1][2] = 300;
		*/
		
		// 2) 2중 for문을 이용한 초기화
		
		// 배열 요소 초기화에 사용할 변수
		int num = 10;
		
		// * 배열 길이
		// -> 배열명.length 는 변수가 직접 참조하고있는 배열의 길이를 반환
		
		System.out.println(arr.length); // 2(행길이)
		// arr이 참조하고 있는 2차원배열의 행의 길이
		
		System.out.println(arr[0].length); // 3(열길이)
		// arr[0]이 참조하고 있는 2차원배열의 열의 길이
		
		for ( int row = 0; row < arr.length; row++) {   // 행반복
			for ( int col = 0; col < arr[row].length; col++) {   // 열반복
				
				arr[row][col] = num;
				num += 10; // 10씩 증가
			}
		}
		
		// 출력
		// Arrays.toString(배열면) : 참조하고 있는 1차원 배열 값을 문자열로 반환
		System.out.println(Arrays.toString(arr));
		
		// Arrays.deepToString(배열명)
		// - 참조하고 있는 배열의 데이터가 나오는 부분까지 파고들어가서
		// 모든 값을 문자열로 반환
		
		System.out.println(Arrays.deepToString(arr));
	}
	
	public void ex2() {
		// 2차원 배열 선언과 동시에 초기화
		
		// 3행 3열짜리 정수형 2차원 배열 선언과 동시에
		// 1~9까지 초기화
		
		int[][] arr = {
				{ 1 , 2 , 3 },
				{ 4 , 5 , 6 },
				{ 7 , 8 , 9 }
		};
		
		// 행 별로 합 출력
		
		for ( int row = 0; row < arr.length; row++) {
			int rowsum = 0;
			for ( int col = 0; col < arr[row].length; col++) {

				
				rowsum += arr[row][col];
			}
			System.out.println(row + "행의 합 : " + rowsum);
		}
		
		System.out.println("=============================");
		
		// 열 별로 합 출력
		
		for ( int col = 0; col < arr.length; col++) {
			int colsum = 0;
			for ( int row = 0; row < arr[col].length; row++) {
				colsum += arr[row][col];
			}
			System.out.println(col + "열의 합 : " + colsum);
		}
		

		System.out.println("=============================");
		
		
		// 전체 합 구하기
		int sum = 0;
		for ( int col = 0; col < arr.length; col++) {
			
			for ( int row = 0; row < arr[col].length; row++) {
				sum += arr[row][col];
			}
			
		}
		System.out.println("총합 :" + sum);
		
	}
	
	public void ex3() {
		
		//가변배열
		// -2차원 배열 생성 시 마지막 배열 차수(열)를 지정하지않고
		//  나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		
		char[][] arr = new char[4][];
		              // char 2차원 배열 생성시 행 부분만 작성
		
		arr[0] = new char[3]; // 0행에 3열 짜리 1차원 배열을 생성하여 주소값 저장
		arr[1] = new char[6];
		arr[2] = new char[5];
		arr[3] = new char[2];
		
		char ch = 'a';
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = ch++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
		
	}
}
