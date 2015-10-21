package com.github.stokito.unitTestExample.calculator;

public class Calculator {

	public int sum(int a, int b) {
		boolean flag = true;
		if (flag) {
		int result = a+b ;
		return result;
		}
		else
		{
			int result = a+b ;
			return result;
		}
		
	}

	public int minus(int a, int b) {
		return a + b;  // ERROR!!!
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
