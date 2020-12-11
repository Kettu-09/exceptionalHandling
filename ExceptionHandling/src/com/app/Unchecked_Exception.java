package com.app;

public class Unchecked_Exception {

	public void method2() {

		System.out.println("methos 2 --------- start");

		ExceptionClass exceptionClass = new ExceptionClass();

		try {

			exceptionClass.method1();

		} catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println("catch block");
		}

	}

	public static void main(String[] args) {

		Unchecked_Exception unchecked_Exception = new Unchecked_Exception();

		unchecked_Exception.method2();

		System.out.println("main -----------end");

	}

}
