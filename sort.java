import java.util.*;

class sort{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		int temp;

		for (int i=0;i<5; i++ ) {
			System.out.print("enter element [ "+ i +"] = ");
			array[i]=sc.nextInt();
			
		}
		int min=array[0];
		for (int i=0;i<4 ;i++ ) {
			min=array[i];
			for (int j=1;j<4 ;j++ ) {
				
			
			if(array[j]<min)
			{
					min=array[i];
					System.out.println(" min is :: "+min);
					System.out.println("array :: "+array[i]);


			}
			}
			array[i]=min;
		}

		for ( int i=0;i<5 ;i++ ) {
			System.out.println("element [ "+ i+" ] value is = " + array[i]);
		}
	}
}