package DAY2;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i =321;
		
		int d;
		
		while(i>0)
		{
			d=i%10;
			switch(d) {
			
			case 3 :System.out.println("three"); break;
			case 5 :System.out.println("five");break;
			case 9 :System.out.println("nine");break;
			case 1 :System.out.println("one");break;
			case 2 :System.out.println("two");break;
			case 4 :System.out.println("four");break;
			case 6 :System.out.println("six");break;
			case 8 :System.out.println("eight");break;
			case 0 :System.out.println("zero");break;
			case 7 :System.out.println("seven");break;
			
			};
			i/=10;
		
		
		
	}

}
}