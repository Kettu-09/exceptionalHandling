package com.app.customException;

public class StudentTest {

	public static void main(String[] args) throws StudentNotFoundException {

		StudentDemo studentDemo = new StudentDemo();
		studentDemo.studentFind("1234");

	}

}
