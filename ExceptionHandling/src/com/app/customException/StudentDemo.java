package com.app.customException;

public class StudentDemo {

	public void studentFind(String studentID) throws StudentNotFoundException {

		if (studentID.equals("123456")) {

			System.out.println("Student is present");

		} else {
			throw new StudentNotFoundException("Sorry this student is not present of ID:-" + studentID);

		}

	}

}
