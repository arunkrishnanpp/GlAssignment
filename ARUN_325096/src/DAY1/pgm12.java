package DAY1;

import java.util.Scanner; 

public class pgm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//System.out.println("enter the total mark of student");
	
	
	 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	 System.out.println("enter the  mark of student");

	    int student_mark1 = myObj.nextInt();
	    int student_mark2 = myObj.nextInt();
	    int student_mark3 = myObj.nextInt();// Read user input
	    System.out.println("Student mark 1 is : " + student_mark1);
	    System.out.println("Student mark 2 is : " + student_mark2);
	    System.out.println("Student mark 3 is : " + student_mark3);
	    myObj.close();
	  double avg=(double) ((student_mark1+student_mark2+student_mark3)/3.0);
	    System.out.println("avg is "+avg);
	    if(avg>=60)
	    	System.out.println("First class");
	    else if(avg<60&&avg>=50)
	    	System.out.println("second class");
	    else if(avg>=30&&avg<=35)
	    	System.out.println("pass class ");
	    else
	    	System.out.println("fail");
	
	}

}
