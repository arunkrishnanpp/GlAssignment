package DAY1;

public class pgm1 {

	public static void main(String[] args) {
		
		int sum=0;
		int x=2;
		int count=0;
		//System.out.println(sum);
		while(count<10) {
			if(prime(x))
			{	System.out.println(x);
				sum=sum+x;
				count++;
			}
			x++;
		}
		
		
		// TODO Auto-generated method stub
		System.out.println("sum is"+sum);
		
		

	}

	private static boolean prime(int x) {
		int p=0;
		int n=x;
		for(int i=2;i<=n/2;i++) {
			
			
			if(n%i==0) {
				p=1;
				break;
			}
			
			
		}
		
		if(p==0)
		//	System.out.println("prime");
			return true;
		else
			//System.out.println("not prime");
			return false;
		
		
		
	}

}
