package DAY10;

import java.util.ArrayList;

public class mainnn {
	public static ArrayList<table1> list1;
	static ArrayList<table2> list2;
	static ArrayList<table3> list3;
	
	public static void main(String[] args) {
		
		operations new1=new operations();
	
		new1.read_exel_1();
		
		
		
		
	for(table1 t:list1)
			System.out.println(t.from);
		
		
		
		

	new1.read_exel_2();
		
		
		
	for(table2 t:list2)
		System.out.println(t.c_id);
		
		

	new1.read_exel_3();
	
	for(table3 t:list3)
		System.out.println(t.no_of_ticket);
		// TODO Auto-generated method stub
	
	
	
	new1.write_exel();

	}

}
