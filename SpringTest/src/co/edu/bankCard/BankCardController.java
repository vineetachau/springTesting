package co.edu.bankCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("bcController")
public class BankCardController {

	@Autowired
    private BankCardManager bcManager;
    
    public BankCardDTO createBankCard(String bankName, String cardNumber, String createDate)
    {
        return this.bcManager.createBankCard(bankName, cardNumber, createDate);
    }
}
