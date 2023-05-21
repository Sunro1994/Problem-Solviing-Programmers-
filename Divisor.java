package step1;

import java.util.ArrayList;

public class Divisor {
	public int sqrt_use(int left) {
		 ArrayList<Integer> arr = new ArrayList<>();
		
			 for(int j=1; j<=Math.sqrt(left);j++) {
				 if(left%j==0) {
					 arr.add(j);
					 	if(left/j!=j) {
					 		arr.add(left/j);
					 	}
			 }
		 }
		
		
		 
		 return arr.size();
	}
}
