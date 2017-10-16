package wipro;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	public static void main(String[] args) {
		// <Tipo> <identificador> = <valor>;
		
		//char
		//numeros: byte, short, int, long
		//floats: double, float
		//boolean (true/false)
		
		//char todaysInitial = 'T';
		//String thisMonth = "October";	
		//char exclamation = 33;
		//int today = 10;
		//boolean isRaining = true;
		
		//System.out.println();
		Scanner scanner = new Scanner(System.in);
		//String name = scanner.nextLine();
		//System.out.println("name = " + name);
				
		//int num1 = scanner.nextInt();		
		//int num2 = scanner.nextInt();
		//int mod = num1 % num2;
		
		//System.out.println(num1 + "%" +num2+ "=" + mod);
		
		//int ten = 10;
		///System.out.println(ten++);
		//System.out.println(ten);
		//System.out.println(++ten);
		
		//ten +=5;
		//int otherTen = 10;
		//System.out.println(ten);
		
		//System.out.println(ten == 10);
		//System.out.println(ten==otherTen);
		
		//boolean isTenGraterThanZero = ten > 0;
		//boolean isTenLessThanOrEqualZero = ten < 0;
		//isTenLessThanOrEqualZero = !isTenGraterThanZero;
		
		//System.out.println(isLassThanZero(1) && isGreaterThanZero(1));
		//System.out.println(isLassThanZero(1) & isGreaterThanZero(1));
		//System.out.println((10 > 0) ^ (20 > 0));
		//System.out.println((10 > 0) && !(20>0) || (!(10 > 0) && (20>0)));
		
		
		String romanos = scanner.nextLine();
		char[]x = romanos.toCharArray();	
		int numero =0;
		for(int i = 0; i <= x.length -1; i++ )
		{			
			if(x[i] == 'I')
			{
				numero +=1;
			}
			if(x[i]=='V')
			{
				if(i!=0 && x[i-1]=='I')
					numero =  5 - numero;
				else
					numero +=5;
					
			}	
		}
		System.out.println(numero);
			
	}
	
	public static boolean isGreaterThanZero(int val){
		System.out.println("Main.isGreaterThanZero");
		return val>0;
	}
	public static boolean isLassThanZero(int val){
		System.out.println("Main.isLassThanZero");
		return val<0;
	}
}
