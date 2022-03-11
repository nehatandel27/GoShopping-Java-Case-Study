package com.tns.application;

import com.tns.framework.*;

public class GSShopFactory implements ShopFactory {

	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc p = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return p;
	}

	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {

		NormalAcc n = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return n;
	}

}
