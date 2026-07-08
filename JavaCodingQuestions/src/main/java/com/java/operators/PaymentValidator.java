package com.java.operators;

public class PaymentValidator {

	private int paymentAmount;
	private String paymentStatus ;
	private String currency ;
	private String paymentMethod ;
	public static void main(String[] args) {
		PaymentValidator paymentValidator = new PaymentValidator(2000,"SUCCESS","INR","CARD");
		boolean isValidPayment  = paymentValidator.validatePayment();
		System.out.println("Payment Valid : " + isValidPayment);
	}

	public PaymentValidator(int paymentAmount, String paymentStatus, String currency ,
			String paymentMethod){
		this.paymentAmount = paymentAmount;
		this.paymentStatus = paymentStatus;
		this.currency = currency;
		this.paymentMethod = paymentMethod;		

	}

	private  boolean validatePayment(){
		if(this.paymentAmount > 0) {
			switch(this.paymentMethod) {
			case "CARD":
				System.out.println("Card Payment");
				break;
			case "GooglePay":
				System.out.println("Google Pay");
				break;
			default:System.out.println("No payment selected");
			break;

			}

			switch(this.paymentStatus) {
			case "SUCCESS":
				System.out.println("Payment is SUCCESS");
				break;
			case "FAILED":
				System.out.println("Payment Failed");
				break;
			default:System.out.println("No update on payment  status");
			break;

			}
			if(this.currency.equals("INR")) {
				System.out.println("Currency is INR");
			}else if(this.currency.equals("EUR")){
				System.out.println("Currency is EUR");
			}
			return true;
		}else {
			System.out.println("payment is lessthan 0");
			return false;
		}

	}

}
