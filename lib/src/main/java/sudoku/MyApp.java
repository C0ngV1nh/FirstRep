package sudoku;

import java.util.Random;

public class MyApp {
	public static int genRandom() {
		Random rand = new Random();
		return rand.nextInt(1,10);
	}
	
	public static void printBoard(int[][] board ) {
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board.length ; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}
	// C:\Users\LENOVO\Desktop\OOP\test\lib\src\main\java
	// https://github.com/C0ngV1nh/FirstRep
	public static int[][] createEmptyBoard(){
		int A[][] = new int[9][9];
		
		for(int i = 0 ; i < A.length ; i++) {
			 for(int j = 0 ; j < A.length ; j++) {
				 A[i][j] = 0;
			 }
		}
		return A;
	}
	
	public static int[][] createRandomBoard(int[][] A){
	
		for(int i = 0 ; i < A.length ; i++) {
			 for(int j = 0 ; j < A.length ; j++) {
//				 
				 if(A[i][j] == 0) {
					
					 for(int h = 1 ; h < 10 ; h++) {
						 if(checkAxist(A, i, j, h) && check3x3(A, i, j, h)) {
							 A[i][j] = h;
							if( createRandomBoard(A) != null ) {
								return A;
							}
							A[i][j] = 0;
						 }
						 
					 }
					 return null;
					 
					 
//					 
				 }
			 }
		}
		return A;
		
	}

	
	public static boolean checkAxist(int[][] A, int row, int col, int x) {
		for(int i = 0 ; i < A.length ; i++) {
			if(A[row][i] == x) {
				return false;
			}else if(i != row && A[i][col] == x) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean check3x3(int[][] A, int row, int col, int x) {
		
			int checkRow = row - row%3;
			int checkCol = col - col%3;

			for(int i = checkRow ; i < checkRow+3 ; i++) {
				for(int j = checkCol ; j < checkCol+3 ; j++) {
					if(A[i][j] == x) {
						return false;
					}
				}
			}
			
			return true;
	}
	
	
	public static void main(String[] args) {
		
		int[][] A = {
//				5 3 0 | 0 7 0 | 0 0 0
//				 6 0 0 | 1 9 5 | 0 0 0
//				 0 9 8 | 0 0 0 | 0 6 0
//				 ------+-------+------
//				 8 0 0 | 0 6 0 | 0 0 3
//				 4 0 0 | 8 0 3 | 0 0 1
//				 7 0 0 | 0 2 0 | 0 0 6
//				 ------+-------+------
//				 0 6 0 | 0 0 0 | 2 8 0
//				 0 0 0 | 4 1 9 | 0 0 5
//				 0 0 0 | 0 8 0 | 0 7 9
			    {5, 3, 0, 0, 7, 0, 0, 0, 0},
			    {6, 0, 0, 1, 9, 5, 0, 0, 0},
			    {0, 9, 8, 0, 0, 0, 0, 6, 0},
			    {8, 0, 0, 0, 6, 0, 0, 0, 3},
			    {4, 0, 0, 8, 0, 3, 0, 0, 1},
			    {7, 0, 0, 0, 2, 0, 0, 0, 6},
			    {0, 6, 0, 0, 0, 0, 2, 8, 0},
			    {0, 0, 0, 4, 1, 9, 0, 0, 5},
			    {0, 0, 0, 0, 8, 0, 0, 7, 9}
			};
		A = createRandomBoard(A);
		
		
		printBoard(A);
	}
}
		