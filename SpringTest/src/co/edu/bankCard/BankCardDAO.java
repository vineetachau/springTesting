package co.edu.bankCard;

public interface BankCardDAO {
	public BankCardDTO insertBankCard(String bankName, String cardNumber, String createDate);
}
