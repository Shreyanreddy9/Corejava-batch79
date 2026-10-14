package com.javafundamentals;
import java.util.Scanner;

public class LoanManagement {
	String customerName;
	double LoanAmount;
	double interestRate;
	int Loantenure;
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the loan amount");
		double LoanAmount=sc.nextDouble();
		System.out.println("Enter the interesrate");
		double interesrrate=sc.nextDouble();
		System.out.println("enter the loantenure");
		int loantenure=sc.nextInt();
		
		LoanManagement lm=new LoanManagement();
		
		double simpleinterest=lm.calculateinterest(LoanAmount,interesrrate);
		System.out.println("simpleinterst: "+simpleinterest);
		
		double totalAmount=lm.calculateTotalAmount(simpleinterest,LoanAmount);
		System.out.println("Totalamount: "+totalAmount);
		 
		double monthlyEmi=lm.calculateMonthlyEMI(totalAmount,loantenure);
		System.out.println("monthly Emi: "+monthlyEmi);
		
		lm.displayloansummary(simpleinterest,totalAmount,monthlyEmi);
		
		
		
		
		
		

	}
	
	double calculateinterest(double loanAmount,double interestRate) {
		double si=(loanAmount*1*interestRate)/100;
		return si;
	}
	
	double calculateTotalAmount(double simpleInterest,double LoanAmount) {
		double TotalPayable=simpleInterest+ LoanAmount;
		return TotalPayable;
		
	}
	double calculateMonthlyEMI(double totalpayable,int Loantenure) {
		double EMI=totalpayable/(Loantenure*12);
		return EMI;
		
	}
	void displayloansummary(double simpleinterest,double totalAmount ,double  monthlyEmi) {
		System.out.println("simple interest:"+simpleinterest);
		System.out.println("TotalAmount:"+totalAmount);
		System.out.println("Monthly Emi:"+monthlyEmi);
	}

}
