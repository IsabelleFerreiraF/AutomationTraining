package wipro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import wipro.domain.Cardholder;
import wipro.domain.Company;

public class ObjectsMain {

	public static void main(String[] args) {
 
		//Cardholder juca = new Cardholder("Juca","0123");
		//System.out.println(juca);
		
		//Company company1 = inputCompany();
		//System.out.println(company1);
		
		//Company company2 = new Company();
		//System.out.println(company2);
		List<Cardholder> lcardholder = new ArrayList<>();
		
		Company company3 = inputCompany();
		Cardholder cardholder = new Cardholder("DJ", "3302", company3);
		
		lcardholder.add(cardholder);
		System.out.println(company3);
	}

	
	public static Company inputCompany(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Company Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Company Location: ");
		String location = scanner.nextLine();
		
		return new Company(name, location, new ArrayList<>());
				
	}
	
	
	
	
	
}
