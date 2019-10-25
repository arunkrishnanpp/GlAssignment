package DAY1;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=151;
		
		int rev=0,d=0;
	int n=num;	
		while(n>0) {
			d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		
		System.out.println(rev);
if(num==rev)
		System.out.println("palindrom");
else
	System.out.println("no palindrom");
	}

}
