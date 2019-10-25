package DAY10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import DAY8.Passenger;

public class operations extends mainnn {

	public void read_exel_1() {
		list1=new ArrayList<table1>();
		// TODO Auto-generated method stub
		//ArrayList<table1>  li=new ArrayList<table1>();
		for(int i=1;i<=2;i++) {
		
		table1 t=new table1();
		
		try {
			File f=new File("C:\\Gltraining\\booking.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("sheet1");
			XSSFRow r=sh.getRow(i);
			XSSFCell c=r.getCell(0);
			t.route_id=(int) c.getNumericCellValue();
			
			
			XSSFCell c1=r.getCell(1);
			t.from=c1.getStringCellValue();
			
			XSSFCell c2=r.getCell(2);
			t.to=c2.getStringCellValue();
			
			
			XSSFCell c3=r.getCell(3);
			t.unit_price=c3.getNumericCellValue();
			
			
			list1.add(t);
			
			
			
			
		
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public void read_exel_2() {
		// TODO Auto-generated method stub
		list2=new ArrayList<table2>();
		// TODO Auto-generated method stub
		//ArrayList<table1>  li=new ArrayList<table1>();
		for(int i=1;i<=2;i++) {
		
		table2 t=new table2();
		
		try {
			File f=new File("C:\\Gltraining\\booking.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("sheet2");
			XSSFRow r=sh.getRow(i);
			XSSFCell c=r.getCell(0);
			t.c_id=(int) c.getNumericCellValue();
			
			
			XSSFCell c1=r.getCell(1);
			t.name=c1.getStringCellValue();
			
			
			
			list2.add(t);
			
			
			
			
		
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

	public void read_exel_3() {
		// TODO Auto-generated method stub
		list3=new ArrayList<table3>();
		// TODO Auto-generated method stub
		//ArrayList<table1>  li=new ArrayList<table1>();
		for(int i=1;i<=2;i++) {
		
		table3 t=new table3();
		
		try {
			File f=new File("C:\\Gltraining\\booking.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("sheet3");
			XSSFRow r=sh.getRow(i);
			XSSFCell c=r.getCell(0);
			t.cid=(int) c.getNumericCellValue();
			
			
			XSSFCell c1=r.getCell(1);
			t.rid=(int) c1.getNumericCellValue();
			
			XSSFCell c2=r.getCell(2);
			t.no_of_ticket=(int) c2.getNumericCellValue();
			
			
			
			
			
			list3.add(t);
			
			
			
			
		
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		}
		
		
		
		
		
	}

	public void write_exel() {
		// TODO Auto-generated method stub
		ArrayList<result>re=new ArrayList<result>();
	
		
		
		for(table3 q:list3) {
			for(table2 w:list2) {
				result r=new result();
				if(q.cid==w.c_id) {
					
					
					r.cid=q.cid;
					System.out.println(r.cid);
					r.name=w.name;
					System.out.println(r.name);
					r.no=q.no_of_ticket;
					System.out.println(r.no);
					r.rid=q.rid;
				
					System.out.println(r.rid);
					serch(r);
					}
					
					
					
				
				
				
				
				
				re.add(r);	
			}
			
			
			
			
			
		}
		
		
		
		for(int i=1;i<=2;i++) {
		try {
			
			for(result rer:re) {
			
			File f=new File("C:\\Gltraining\\booking.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("sheet4");
			
			
			//System.out.println(r.cid);
				XSSFRow r1=sh.createRow(i);
				XSSFCell c1=r1.createCell(0);
			c1.setCellValue(rer.cid);
			
			
			
			XSSFCell c2=r1.createCell(1);
			c2.setCellValue(rer.name);
			
			
			
			
			XSSFCell c3=r1.createCell(2);
			c3.setCellValue(rer.from);
			
			
			
			XSSFCell c4=r1.createCell(3);
			c4.setCellValue(rer.to);
			
			
			XSSFCell c5=r1.createCell(4);
			c5.setCellValue(rer.unit_price);
			
			
			XSSFCell c6=r1.createCell(5);
			c6.setCellValue(rer.no);
			
			FileOutputStream fo=new FileOutputStream(f);
			wb.write(fo);
			
			
			
			}
		}
			
			
			
			
			
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

		
		
	}



	}

	private void serch(result r) {
		// TODO Auto-generated method stub
		
		for(table1 b:list1) {
			if(r.rid==b.route_id) {
				r.from=b.from;
				r.to=b.from;
				r.unit_price=b.unit_price;
				r.price=r.no*r.unit_price;
				
			}
			
		}
		
	}
}
			
	
	
	

