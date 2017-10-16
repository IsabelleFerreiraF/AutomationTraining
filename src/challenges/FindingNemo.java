package challenges;

import java.util.Scanner;

public class FindingNemo {
	
	public static void main(String args[]) {
        char[][] sea = inputMatrix();
        printMatrix(sea);

        if (isNemoInThere(sea)) {
                 System.out.println("Nemo found!!!");
        } else {
                 System.out.println("Nemo Not Found! :/");
        }
	}

	public static boolean isNemoInThere(char[][] sea) {
		for(int i=0; i <sea.length; i++)
		{
			for(int j=0; j<sea.length; j++){
				if(sea[i][j] == 'N'){
					      if(findDown(i,j,sea,'E') && findDown(i,j,sea,'M')&& findDown(i,j,sea,'O'))
					      {
					    	  return true;
					      }
					      else
					    	 if(findRight(i,j,sea,'E')&&findRight(i,j,sea,'M')&&findRight(i,j,sea,'O'))
					    	 {
						    	  return true;
						      }
				}
					if(sea[i][j] == 'O'){
						 if(findDown(i,j,sea,'M') && findDown(i,j,sea,'E')&& findDown(i,j,sea,'N'))
					      {
					    	  return true;
					      }
					      else
					    	 if(findRight(i,j,sea,'M')&&findRight(i,j,sea,'E')&&findRight(i,j,sea,'N'))
					    	 {
						    	  return true;
						      }
					}
			}
		}
		return false;
	}
	
	private static boolean findDown(int i, int j, char[][]sea, char c){
		int tam = 3; //sea.length;
		for(int l =i+1; l<=tam; l++ ){
			
			if( sea[l][j]==c )
			{
				return true;
			}
		}
		return false;
	}
	
	private static boolean findRight(int i, int j, char[][]sea, char c){
		int tam = 3; //sea.length;
		for(int l =j+1; l<=tam; l++ ){
			
			if( sea[i][l]==c )
			{
				return true;
			}
		}
		return false;
	}

	private static void printMatrix(char[][] matrix) {
        System.out.println();
        for (int m = 0; m < matrix.length; m++) {
                 char[] row = matrix[m];
                 for (int n = 0; n < row.length; n++) {
                          char col = row[n];
                          System.out.print(col + " ");
                 }
                 System.out.println();
        }
        System.out.println();
	}

	private static char[][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[5][];
        for (int i = 0; i < 5; i++) {
                 do {
                          System.out.print("Line #"+(i+1)+": ");
                          matrix[i] = scanner.nextLine().toUpperCase().trim().toCharArray();
                 } while (matrix[i].length != 5); // Ha! Told you do-whiles are useful! :P
        }
        return matrix;
	}
}
