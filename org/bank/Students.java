package org.bank;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("getStudentInfo method with id as arg "+ id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("getStudentInfo method with id & name as arg "+id+ " "+ name);
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("getStudentInfo method with email & phoneNumber as arg "+ email +" "+phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students students = new Students();
		students.getStudentInfo(12919);
		students.getStudentInfo(12919, "Hema");
		students.getStudentInfo("Hema@gmail.com", 89392897);
		}

}
