package ClassAndObject;

/*Assignment 1:
Create two Student objects and initialize their properties.

Print the details of each student and the total number of students.

Modify the age of one student and print the updated details.

Create another Student object and update the total number of students.

Print the details of the new student and the updated total number of students.*/

public class Student {

	String name;
	int age;

	public static void main(String[] args) {

		int totalNumberOfStudent = 0;

		Student s1 = new Student();
		Student s2 = new Student();

		s1.name = "abdul";
		s1.age = 21;

		s2.name = "kalam";
		s2.age = 25;

		System.out.println("Student One = " + s1.name + " " + s1.age);
		totalNumberOfStudent++;
		System.out.println("Student Two = " + s2.name + " " + s2.age);
		totalNumberOfStudent++;

		System.out.println("Total number of student : " + totalNumberOfStudent);

		s2.age = 23;
		System.out.println("Student Two = " + s2.name + " " + s2.age);

		Student s3 = new Student();

		s3.name = "king";
		s3.age = 27;
		System.out.println("Student Three = " + s3.name + " " + s3.age);

		totalNumberOfStudent++;
		System.out.println("Total number of student : " + totalNumberOfStudent);
	}

}
