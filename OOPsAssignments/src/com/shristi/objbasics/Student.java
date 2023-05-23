package com.shristi.objbasics;

//import java.util.Scanner;

public class Student {
	String name;
	String department;

	Student(String name, String department) {
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("name:" + name);
		System.out.println("department:" + department);
	}

	String getGrades(int[] marks) {

		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total=total+ marks[i];
		}
		System.out.println("total"+total);
		float average = total/marks.length;
		System.out.println("average"+average);

		if (average >= 90) {
			return "A";
		} else if (average > 80 && average < 90) {
			return "B";

		}
		else if(average>70&&average<80) {
			return "C";
		}
			else {
				return "fail";
		}
	}
}