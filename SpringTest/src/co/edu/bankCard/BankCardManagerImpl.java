package co.edu.bankCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bcManager")
public class BankCardManagerImpl implements BankCardManager {

	@Autowired
	private BankCardDAO bankCardDao;

	@Override
	public BankCardDTO createBankCard(String bankName, String cardNumber, String createDate) {

		System.out.println("Bank card has been created by BankCardManagerImpl. Bank name : " + bankName + " , card number : " + cardNumber + " , create date : " + createDate);
		return this.bankCardDao.insertBankCard(bankName, cardNumber, createDate);
	}

}
