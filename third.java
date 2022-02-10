import java.util.*;

class third{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		int start=0;
		int end=4;
		for (int i=0; i<5; i++) {
			System.out.print(" value of [ " +i+ " ] = ");
			array[i]=sc.nextInt();
			
		}
		int temp;
		for (int i=0;i<end ;i++ ) {
				
				temp=array[i];
				array[i]=array[end];
				array[end]=temp;
				end--;			
		}

		for ( int i=0;i<5 ;i++ ) {
			System.out.println(" index of [" + i + " ] and value = " + array[i]);
			
		}

	}
}