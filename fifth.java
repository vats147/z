import java.util.*;

class fifth{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] array=new String[5];
		int temp;

		for (int i=0;i<5; i++ ) {
			System.out.print("enter element [ "+ i +"] = ");
			array[i]=sc.next();
			
		}


		for (int i=0; i<5; i++) {
			
			System.out.println(" element [ "+i +" ] = "+array[i]);
		}
	}
}