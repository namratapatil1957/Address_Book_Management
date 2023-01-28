package com.bridgelabz.addressbook;
import java.util.*;

public class address_Book {

	private String fname;
	private String lname;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phone_no;
	private String email;
	
	address_Book [] arr = new address_Book[5];
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}

	
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

@Override
	public String toString() {
		return "address_Book [fname=" + fname + ", lname=" + lname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phone_no=" + phone_no + ", email=" + email + "]";
	}


	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		
		
		contact_Person person = new contact_Person();

		System.out.println(" --------- Enter the details in the Address Book --------- ");
		System.out.println();
		person.add();
		
		String action;
		do {
			System.out.println(" \n Enter what action you want to perform: ");
			System.out.println(" \n 1. Add  \n 2. Edit  \n 3. Exit");
			action = sc.next();
			
			switch (action) {
			
			case "add":
				person.add();
				break;
				
			case "edit":
				person.edit();
				break;
			
			case "exit":
				return;
			
			default:
				System.out.println(" Enter the correct Choice");
				break;
				
			}
		}while(action != "exit");
		System.out.println();
	}
}
