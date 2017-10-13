package com.cg.jpacrud.client;



import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cg.jpacrud.entities.Customer;
import com.cg.jpacrud.service.CustomerServiceImpl;
import com.cg.jpacrud.service.ICustomerService;


public class CustomerClient {

	public static void main(String[] args) {
		
		ICustomerService service = new CustomerServiceImpl();
		Customer cust=new Customer();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		
		/*cust.setId(104);
		cust.setName("Prachi");
		cust.setMob("9223456789");
		cust.setEmail("zbc@abc.com");
		cust.setDob(new Date());
		*/
		do{
			System.out.println("Enter choice:\n1. add details\n"
					+"2. get details by id \n"
					+"3. get details by mobile no. \n"
					+"4. display all details \n"
					+"5. get count \n"
					+"6. exit");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("enter id");
				cust.setId(sc.nextInt());
				System.out.println("enter name");
				cust.setName(sc.next());
				System.out.println("enter mobile");
				cust.setMob(sc.next());
				System.out.println("enter email");
				cust.setEmail(sc.next());
				cust.setDob(new Date());

				service.addCustomer(cust);
				
				//at this breakpoint, we have added one record to table
				System.out.print("ID:"+cust.getId());
				System.out.println(" Name:"+cust.getName());
				System.out.println("Mobile number:"+cust.getMob());
				System.out.println("Date:"+cust.getDob());
				System.out.println("email:"+cust.getEmail());
				
			break;
			
			case 2:
				System.out.println("enter id:");
				int id=sc.nextInt();
				cust = service.findCustomerById(101);
				System.out.println("customer with entered id:"+cust);
			break;
				
			case 3:
				//String str=cust.getMob();
				//cust = service.findCustomerByMobile(str);
				//cust = service.findCustomerByMobile("2222222222");
				System.out.println("enter mobile no:");
				String mob=sc.next();
				cust = service.findCustomerByMobile(mob);
				System.out.println(cust);
			break;
			
			case 4:
				System.out.println("--------Customer Details---------");
				for(Customer c:service.getDetails())
				{
					System.out.println(c);
				}
			break;
			
			case 5:
				long count=service.getCount();
				System.out.println(count);
			break;
			
			case 6:
				System.exit(0);
			break;
			}
			
			
		}
		while(ch!=6);
		
	
		/*
		cust = service.findCustomerById(100);
		cust.setName("Jyotsna surve");
		service.updateCustomer(cust);
		System.out.println("updated ID:"+cust.getId());
		System.out.println("updated Name:"+cust.getName());
		*/
		
		

	}
}
