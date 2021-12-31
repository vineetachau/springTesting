package co.edu.bankCard;

import org.springframework.stereotype.Repository;

@Repository("bcDao")
public class BankCardDAOImpl implements BankCardDAO {

	@Override
    public BankCardDTO insertBankCard(String bankName, String cardNumber, String createDate) {
        BankCardDTO ret = new BankCardDTO();
        ret.setBankName(bankName);
        ret.setCardNumber(cardNumber);
        ret.setCreateDate(createDate);
        
        System.out.println("Bank card has been inserted by BankCardDAOImpl. Bank name : " + bankName + " , card number : " + cardNumber + " , create date : " + createDate);
        return ret;
    }

}
