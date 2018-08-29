package com.Gugudan;

import java.util.Scanner;

public class AnyMulti2 {
	private static Scanner sc;

	public static void Multi(){
		sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] num = str.split(",");
		
		int first = Integer.parseInt(num[0]);
		int second = Integer.parseInt(num[1]);
				
		for(int i=2; i<first+1; i++) {
			for(int j=1; j<second+1; j++) {
				System.out.println(i*j);
			}
		}
	}
}
