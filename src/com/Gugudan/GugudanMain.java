package com.Gugudan;

public class GugudanMain {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {			//반복 출력
			int[] result = Gugudan.calculate(i);
			Gugudan.print(result);;
		}
	}
}
