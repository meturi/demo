package com.manasa;

import java.util.Comparator;

public class EidComparator implements Comparator<CustomArraylist>{

	@Override
	public int compare(CustomArraylist o1, CustomArraylist o2) {
		// TODO Auto-generated method stub
		if(o1.eid == o2.eid)
			return 0;
		else if(o1.eid > o2.eid)
			return 1;
		else
			return -1;
	}

}
