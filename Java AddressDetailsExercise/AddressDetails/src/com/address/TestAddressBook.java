package com.address;

public class TestAddressBook {
	AddressBook addressList = new AddressBook();
	public  void populteBook() {
		SingleAddress saddress1 = new SingleAddress("shyamprasad","Meka","Nalgonda","Munugode","India",508244);
		SingleAddress saddress2 = new SingleAddress("Ranjith","Vana","Chittor","Andhra","India",508257);
		SingleAddress saddress3 = new SingleAddress("Yashwanth","tm","Banglore","Munugode","India",508255);
		SingleAddress saddress4 = new SingleAddress("Jagan","Injamury","miryalaguda","Nalgonda","India",508435);
		addressList.List.add(saddress1);
		addressList.List.add(saddress2);
		addressList.List.add(saddress3);
		addressList.List.add(saddress4);
		System.out.println(saddress1.toString());
	}
	public static void main(String[] args) {
		TestAddressBook testBook = new TestAddressBook();
		testBook.populteBook();
		System.out.println(testBook.addressList.List);
		SingleAddress singleaddress = new SingleAddress("Sonata","software","Banglore","Karnataka","India",506002);
	     try {
			testBook.addressList.addNewAddress(singleaddress);
		} catch (DuplicateAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     System.out.println(testBook.addressList.List);
	     testBook.addressList.removeAddress(singleaddress);
	     System.out.println(testBook.addressList.List);
	     System.out.println(testBook.addressList.toString(singleaddress));
		
	}
		
		
		
	}

	


