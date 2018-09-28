package com.hashmap.campusmind;

import java.util.Comparator;
import java.util.Map;

public class DOJComparator implements Comparator<Map.Entry<String, CampusMind>>{
	public int compare(Map.Entry<String,CampusMind> cm1, Map.Entry<String,CampusMind> cm2){
		return cm1.getValue().getDoj().compareTo(cm2.getValue().getDoj());
	}

}
