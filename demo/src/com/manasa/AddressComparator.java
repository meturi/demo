package com.manasa;

import java.util.Comparator;

public class AddressComparator implements Comparator<CustomArraylist>{

	@Override
	public int compare(CustomArraylist o1, CustomArraylist o2) {
		// TODO Auto-generated method stub
		return o1.address.compareTo(o2.address);
	}

}
