package com.supriya.beans;

public class PaymentProcessor {
	public boolean dopayment(String Cardtype,Double billAMt) {
		if("CREDIT_CARD".equals(Cardtype)) {
			CreditCardPayment payemntcredit=new CreditCardPayment();
			return payemntcredit.payBill(billAMt);
		}
		if("DEBIT_CARD".equals(Cardtype)) {
			DebitCardPayment payemntdebit=new DebitCardPayment();
	return	payemntdebit.payBill(billAMt);
		}
		 
		if("ZETA_CARD".equals(Cardtype)) {
		ZetaCardPayment  paymentzeta=new ZetaCardPayment();
		return paymentzeta.payBill(billAMt);
		
		}
		else {
			return false;
		}
		
	}

}
