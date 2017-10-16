package challenges;

import java.util.Scanner;

public class Translator {
	
        public static void main(String args[]) {
                String sentence = inputString();
                String sentenceInAlBhed = translateToAlBhed(sentence.toUpperCase());
                System.out.println("Al-Bhed: " + sentenceInAlBhed);
        }

        public static String translateToAlBhed(String englishSentence) {
        	char[] translate = englishSentence.toCharArray();
        	char[]alBhed = {'A' , 'B', 'C' , 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        	char[]english = {'E' , 'P', 'S' , 'T', 'I', 'W', 'K', 'N', 'U', 'V', 'G', 'C', 'L', 'R', 'Y', 'B', 'X', 'H', 'M', 'D', 'O', 'F', 'Z', 'Q', 'A', 'J'};
        	for(int i=0; i<translate.length; i++)
        	{
        		for(int l=0; l<english.length; l++)
        			if(translate[i] == english[l])
        			{
        				translate[i]=alBhed[l];
        				break;
        			}
        	}
        	
        	return String.copyValueOf(translate);
                // TODO: Your code goes here
        }

        private static String inputString() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("English: ");
                return scanner.nextLine();
        }

}
