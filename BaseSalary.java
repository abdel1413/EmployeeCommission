package com.Tchakoura;

public class BaseSalary extends CommissionEmployee {
	
	private double baseSalary;

	/**
	 * @param firstName
	 * @param lastName
	 * @param sSN
	 * @param GrossSales
	 * @param CommissionRate
	 */
	public BaseSalary(String firstName, String lastName, String sSN,
			double GrossSales, double CommissionRate,double baseSalary) {
		super(firstName, lastName, sSN, GrossSales, CommissionRate);
		
		//check validity
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
		
	}
       //getters setters
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("base salary must be >=0.0");
		}
		this.baseSalary = baseSalary;
	}
	@Override
	public double earnings() {
		
		return   getBaseSalary() * super.earnings();
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%s: %s%n%s: $%.2f",
				            "base salaried ", super.toString(),
				            "Base- salary ", getBaseSalary());
	}
	
	
	

}
