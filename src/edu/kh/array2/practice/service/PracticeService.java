package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {
	public void practice7() {
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
	
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		/*
		
		System.out.println("====1분단====");		
		if(arr1[a][b] != null)
				for(int a = 0; a < arr1.length; a++) {
					for(int b = 0; b <arr1[a].length; b++) {
						
					}
				}
		*/	
		
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = new String[6][6];
		System.out.print("행 인덱스 입력 : ");
		int input1 = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int input2 = sc.nextInt();
		
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b <arr[a].length; b++) {
				if (a == 0 && b == 0) {
					arr[a][b] = " ";
				} else if ( b == 0 ) {
					arr[a][b] = Integer.toString(a-1);
				} else if  ( a == 0 ) {
					arr[a][b] = Integer.toString(b-1);
				} else if (a == input1+1 && b == input2+1 ) {
					arr[a][b] = "X";
				} else {
					arr[a][b] = " ";
				}
				
			}
		}
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b <arr[a].length; b++) {
				System.out.print( arr[a][b] + " ");
			} 
			System.out.println();
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][6];
		
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b <arr[a].length; b++) {
				if (a == 0 && b == 0) {
					arr[a][b] = " ";
				} else if ( b == 0 ) {
					arr[a][b] = Integer.toString(a-1);
				} else if ( a == 0 ) {
					arr[a][b] = Integer.toString(b-1);
				} else {
					arr[a][b] = " ";
				}
				
			}
		}
		
		while(true) {
		
		
		System.out.print("행 인덱스 입력 : ");
		int input1 = sc.nextInt();

		if( input1 == 99) {
			System.out.println("프로그램 종료");
			break;
		}		
		System.out.print("열 인덱스 입력 : ");
		int input2 = sc.nextInt();
		
		arr[input1+1][input2+1] = "X"; 
		

		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b <arr[a].length; b++) {
				System.out.print( arr[a][b] + " ");
			} 
			System.out.println();
		}
		
		} 
	}
}


