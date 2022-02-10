import java.util.*;

class eight{
	public static void main(String[] args) {
		int ary[]={6,8,9,10};		
		Scanner sc=new Scanner(System.in);
		int tmp=ary[0];
		int find=0;
		 
		for (int i=0;i<4 ;i++ ) {

			if(ary[i]==tmp)
			{
				tmp++;
			}
			else
			{
				if(4/2>=i){
				find=tmp;
				System.out.println("great");
			}
				else
					{
						find=tmp-1;
					}

				tmp++;
				i++;
			//	System.out.println(" inside"+find);

			}
		}
		System.out.println(find);
		}
	}