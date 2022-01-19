package com.address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook implements addressBookInterface {

	List<SingleAddress> List = new ArrayList<SingleAddress>();

	@Override
	public void addNewAddress(SingleAddress address) throws DuplicateAddressException {
		// TODO Auto-generated method stub
			for( SingleAddress address1 : List) {
				if(address1.firstName == address.firstName){
					throw new DuplicateAddressException("Address with the first name already exist");
			}
				
				
			}
			List.add(address);
		}
			
	

	@Override
	public void removeAddress(SingleAddress address) {
		// TODO Auto-generated method stub
		for( Iterator<SingleAddress> iterator = List.iterator(); iterator.hasNext(); ) {
			SingleAddress address1 = iterator.next();
			if(address1.firstName == address.firstName) {
				iterator.remove();
			}
		}
	}
	public String  toString(SingleAddress address) {
		 return address.firstName +" ,"+ address.lastName +" ," + address.streetAddress  +" ,"+ address.city +" ,"  +" ," + address.country +" ," + address.postalCode;
	}

}