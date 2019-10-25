package DAY2;

public class pgm4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int summ=0;
	for(int i=10;i<=50;i++) {
		if(i%5==0) {
			summ+=i;
			if(i!=50)
			System.out.print(i+"+");
			else
				System.out.print(i);
			
			
		}
	}
	
	
	System.out.print("="+summ);
	}

}
