package com.tns;

import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;

public class Main {

	public void main(String[] args) {
		float charges = 1000;

		GSShopFactory u = new GSShopFactory();

		PrimeAcc p = u.getNewPrimeAccount(1, "Neha", 1000, true);
		NormalAcc n = u.getNewNormalAccount(2, "neha2", 1000, 50);

		p.bookProduct(charges);
		n.bookProduct(charges);
	}

}
