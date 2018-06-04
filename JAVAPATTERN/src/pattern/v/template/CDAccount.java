package pattern.v.template;

public class CDAccount extends SystemAccount{

	@Override
	String getAcoountType() {
		// TODO Auto-generated method stub
		return "Certificate of Deposite";
	}

	@Override
	double getInterestRate() {
		// TODO Auto-generated method stub
		return 0.2;
	}
	

}
