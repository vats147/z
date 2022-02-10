import java.util.*;

class six{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar1=new int[5];
		int[] ar2=new int[5];
		int[] sum=new int[5];
		System.out.println(" enter first array ");
		for (int i=0;i<5 ;i++ ) {
			System.out.print("enter element [ "+ i+" ] = ");
			ar1[i]=sc.nextInt();
		}
		System.out.println(" enter Second array ");

		for (int i=0;i<5 ;i++ ) {
			System.out.print("enter element [ "+ i+" ] = ");
			ar2[i]=sc.nextInt();
			sum[i]=ar1[i]+ar2[i];
		}

		System.out.println("=========\n sum of two array");

		for (int i=0;i<5 ;i++ ) {
			System.out.println("sum  [ "+ i+" ] = "+sum[i]);
			
		}

	}
}