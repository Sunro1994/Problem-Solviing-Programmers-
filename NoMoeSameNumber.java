package step01;

import java.util.ArrayList;


public class NoMoeSameNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,1,3,4};
		
		
		
	 ArrayList<Integer> answerList = new ArrayList<Integer>();
     int value = -1;
     for(int i=0; i<arr.length; i++) {
         if(arr[i] != value) {
             answerList.add(arr[i]);
             value = arr[i];
         }
     }
     int[] answer  = answerList.stream().mapToInt(i->i).toArray();
		
		
		
		
		
		
		
		
		
	}
}
