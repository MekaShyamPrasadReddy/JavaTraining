package com.address;

public interface addressBookInterface {
	public void addNewAddress(SingleAddress address) throws DuplicateAddressException;
	public void removeAddress(SingleAddress address);
	
	

}
