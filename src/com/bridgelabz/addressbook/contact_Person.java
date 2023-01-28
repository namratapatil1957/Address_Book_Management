package com.bridgelabz.addressbook;
import java.util.*;

public class contact_Person extends address_Book{
	
	Scanner sc = new Scanner(System.in);
	int n =1;
	ArrayList<address_Book> addressbook = new ArrayList<>();
	
	void add(){
		
		contact_Person person = new contact_Person();
		
		for (int i = 0; i < n; i++) {
			System.out.println(" Enter the first name of the person: ");
			String fname = sc.next();
			person.setFname(fname);
			
			System.out.println(" Enter the last name of the person: ");
			String lname = sc.next();
			person.setLname(lname);
			
			System.out.println(" Enter the Address: ");
			String address = sc.next();
			person.setAddress(address);
			
			System.out.println(" Enter the city: ");
			String city = sc.next();
			person.setCity(city);
			
			System.out.println(" Enter the State: ");
			String state = sc.next();
			person.setState(state);
			
			System.out.println(" Enter the Zip: ");
			int zip = sc.nextInt();
			person.setZip(zip);
			
			System.out.println(" Enter the phone: ");
			long phone_no = sc.nextLong();
			person.setPhone_no(phone_no);
			
			System.out.println(" Enter the email: ");
			String email = sc.next();
			person.setEmail(email);
		
			arr[i] = person;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == null)
					break;
				System.out.println(arr[i]);
			}	
		}
	}
	
	void edit() {
		
		contact_Person person = new contact_Person();

		System.out.println(" Enter the first name of the person: ");
		String name = sc.next();
		person.setFname(name);
		
		if(name.equals(person.getFname())) {
			
		    System.out.println("Enter the number for editing: ");
		    System.out.println(" 1: Last name /n 2:Address /n 3:City /n 4:State /n 5:Phone_no /n 6:Zip ");
		    int option = sc.nextInt();	        
		        
		    for (int i = 0; i < n; i++) {       	
		    	
		    	switch (option) {
			        case 1:
			        	System.out.println("Enter the lastname");
			            String lname = sc.next();
			            person.setLname(lname);
			            break;
			            
			        case 2:
			        	System.out.println("Enter the address");                                
			        	String address = sc.next();                                
			        	person.setAddress(address);                                
			        	break;
			                            
			        case 3:                               
			        	System.out.println("Enter the city");                                
			        	String city = sc.next();                                
			        	person.setCity(city);                               
			        	break;
			                            
			        case 4:                               
			        	System.out.println("Enter the state");                               
			        	String state = sc.next();                                
			        	person.setState(state);                                
			        	break;
			                            
			        case 5:                                
			        	System.out.println("Enter the phone number");                               
			        	long phone_no = sc.nextLong();                                
			        	person.setPhone_no(phone_no);                                
			        	break;
			                            
			        case 6:                               
			        	System.out.println("Enter the zip");                               
			        	int zip = sc.nextInt();                                
			        	person.setZip(zip);                               
			        	break;
			        	}   
		
			        arr[i] = person;
		        }
		   
		}
	}
                

}

