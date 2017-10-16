package wipro.domain;

public class Cardholder extends AbstractEntity {

	public static final int INITIAL_BALANCE = 0;

	private String cardNumber;
	private Company company;


	

	public Cardholder(String name, String cardNumber, Company company) {
		super(name);
		this.cardNumber = cardNumber;
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	@Override
	public String toString() {
		return "Cardholder [cardNumber=" + cardNumber + ", name=" + name +"]";
	}

	
	
}
