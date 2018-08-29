package com.Gugudan;

import java.util.Scanner;

public class AnyMulti {
	private static Scanner sc;

	public static void Multi(){
		sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=2; i<num+1; i++) {
			for(int j=1; j<num+1; j++) {
				System.out.println(i*j);
			}
		}
	}
}
