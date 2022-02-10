//create array and store and display

import java.util.*;

public class first {
	public static void main(String[] args) {
		int[] ary=new int[5];
		Scanner sc=new Scanner(System.in);
		//input in array
		for (int i=0; i<5; i++) {
				System.out.print("enter element [" + i + " ] = ");
				ary[i]=sc.nextInt();
				
			}	

		for (int i=0; i<5; i++) {
			System.out.println(" element [ "+i +" ] = "+ary[i]);
		}
	}

}