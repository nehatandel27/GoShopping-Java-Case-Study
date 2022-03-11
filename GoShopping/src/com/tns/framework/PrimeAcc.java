package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {

	private boolean isPrime;

	public boolean getisPrime() {
		return this.isPrime;
	}
	
	private static final float deliveryCharges = 50;

	public static float getDeliverycharges() {
		return deliveryCharges;
	}


	public PrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		super(AccNo, accNm, charges);
		this.isPrime = isPrime;
		
	}

	
	public void bookProduct(float f) {
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", isPrime()=" + getisPrime() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
