package wipro.domain;

import java.util.ArrayList;
import java.util.List;

public class Company extends AbstractEntity{

	private String location;
	private List<Cardholder> cardholders = new ArrayList<>();
	
	public Company(){
		this("N/A", "N/A", new ArrayList<>());
	}
	
	public Company(String name, String location, List<Cardholder> cardholders) {
		super(name);
		this.location = location;
		this.cardholders = cardholders;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Cardholder> getCardholders() {
		return cardholders;
	}

	public void setCardholders(List<Cardholder> cardholders) {
		this.cardholders = cardholders;
	}

	@Override
	public String toString() {
		return "Company [location=" + location + ", cardholders=" + cardholders + "]";
	}



}
