package step01;

import java.util.Scanner;

public class Square_MakeStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int col = sc.nextInt();
	    int row = sc.nextInt();
	    
	    for(int i =0; i<row ; i++ ) {
	        for(int j=0; j<col ; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	}
	
	}
}

    

