package deneme;

import java.util.Random;

public class Deneme {

	public static void main(String[] args) {

		Random r = new Random();
		
		int[][][] matris1 = new int[3][3][3];
		int[][][] matris2 = new int[3][3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					matris1[i][j][k]=r.nextInt(10);
					matris2[i][j][k]=r.nextInt(10);
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int l = 0; l<3; l++) {
					System.out.print(matris1[i][j][l]);
				}
				System.out.println();
			}
		}
		
		
	
	}
}