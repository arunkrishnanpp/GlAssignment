package DAY2;

public class pgm11 {

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

	private static boolean prime(int n) {
		boolean p=true;

		for(int i=2;i<=n/2;i++) {
			
			
			if(n%i==0) {
				p=false;
				break;
			}
			
			
		}
//		
//		if(p==0)
//		//	System.out.println("prime");
//			return true;
//		else
//			//System.out.println("not prime");
//			return false;
//		
		return p;
		
	}

}
