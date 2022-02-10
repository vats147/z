import java.util.*;

class second{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int min=0,max=0;
		int[] array=new int[5];

		for (int i=0; i<5; i++) {
			System.out.print(" enter value of [ "+ i+ " ]  = ");
			array[i]=sc.nextInt();
			

			
		}
		min=array[0];
		for (int i=0;i<5 ;i++ ) {
			if(array[i]<min)
			{
					min=array[i];
			}

			if (array[i]>max) {
					max=array[i];
				
			}
			
		}
		System.out.print("Min = "+min+" Max = "+max);
	}
}