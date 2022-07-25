package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("studentName from Student class");
	}
	public void studentDept()
	{
		System.out.println("studentDept from Student class");
	}
	public void studentId()
	{
		System.out.println("studentId from Student class");
	}
	public static void main(String[] args) {
		Student stu =  new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentName();
		stu.studentId();
	}
}
