package com.java.operators;

public class PaymentValidator {

	private int paymountAmount;
	private String paymentStatus ;
	private String currency ;
	private String paymentMethod ;
	public static void main(String[] args) {
		PaymentValidator paymentValidator = new PaymentValidator(2000,"SUCESS","INR","CARD");
		paymentValidator.validatePayment(paymentValidator);
	}

	private  PaymentValidator(int paymountAmount, String paymentStatus, String currency ,
			String paymentMethod){
		this.paymountAmount = paymountAmount;
		this.paymentStatus = paymentStatus;
		this.currency = currency;
		this.paymentMethod = paymentMethod;		

	}

	private  void validatePayment(PaymentValidator paymentValidator){
		if(paymentValidator.paymountAmount > 0) {
			switch(paymentValidator.paymentMethod) {
			case "CARD":
				System.out.println("Card Payment");
				break;
			case "GooglePay":
				System.out.println("Google Pay");
				break;
			default:System.out.println("No payment selected");
			break;

			}

			switch(paymentValidator.paymentStatus) {
			case "SUCESS":
				System.out.println("Payment is SUCESS");
				break;
			case "FAILED":
				System.out.println("Payment Failed");
				break;
			default:System.out.println("No update on payment  status");
			break;

			}
			if(paymentValidator.currency.equals("INR")) {
				System.out.println("Currency is INR");
			}else if(paymentValidator.currency.equals("EUR")){
				System.out.println("Google Pay");
			}
		}else {
			System.out.println("paymount is lessthan 0");
		}

	}

}
