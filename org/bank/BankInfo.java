package org.bank;

public class BankInfo {
	public void saving()
	{
		System.out.println("saving from BankInfo class");
	}
	public void fixed()
	{
		System.out.println("fixed from BankInfo class");
	}
	public void deposit(int a)
	{
		System.out.println("deposit from BankInfo class overrides deposit from axis bank by passing int value");
	}
	public static void main(String[] args) {
		BankInfo binfo = new BankInfo();
		binfo.deposit(50);
	}
}