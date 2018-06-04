package pattern.v.template;

abstract class SystemAccount {
	
	abstract String getAcoountType();

	abstract double getInterestRate();

	public double computeInterest(double amount) {
		
		return amount * this.getInterestRate(); 
	}
}
