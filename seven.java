import java.util.*;

class seven{
	public static void main(String[] args) {
		int ary[]={1,2,3,4,5};
		int tmp;
		Scanner sc=new Scanner(System.in);
		int temp=5;
		int k=4;
		//for cyclik rorate
		for (int i=0;i<temp ;i++ ) {
			tmp=ary[i];
			ary[i]=ary[k];
			ary[k]=tmp;
			temp--;
		}
		for ( int i=0;i<5 ;i++ ) {
			System.out.println(" index of [" + i + " ] and value = " + ary[i]);
			
		}

	}
}