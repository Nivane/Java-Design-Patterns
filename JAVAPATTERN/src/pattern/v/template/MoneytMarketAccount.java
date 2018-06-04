package pattern.v.template;

public class MoneytMarketAccount extends SystemAccount{

	@Override
	String getAcoountType() {
		// TODO Auto-generated method stub
		return "Money Market";
	}

	@Override
	double getInterestRate() {
		// TODO Auto-generated method stub
		return 0.1;
	}
	

}
