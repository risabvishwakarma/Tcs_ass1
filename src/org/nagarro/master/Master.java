package org.nagarro.master;

import java.util.Scanner;

import org.nagarro.service.Service;
import org.nagarro.service.ServiceImp;

public class Master {
	static Service service=new ServiceImp();
	 static int choice=-1;
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("Press 1 : create new class\n"
					+ "Press 2 :get All Cars\n"
					+"Press 3 : Calculate Insurance\n"
					+"Press -1 : for exit\n");
	
				try {
					choice=sc.nextInt();
				} catch (Exception e) {
					System.out.println("Error : "+e.getMessage());
					continue;
				}
			
			
			if(choice==-1)break;
			switch(choice) {
			case 1:{
			service.createCar();
			break;}
		
			case 2:{
				service.getCars();
				
				break;}
			case 3:{
				service.calculateInsurance();
				
				break;}
			case 4:{
				
				break;}
			}
			
			
		}

	}

}
