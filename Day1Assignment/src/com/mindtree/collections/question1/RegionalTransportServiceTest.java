package com.mindtree.collections.question1;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author C2-Orchard
 *	Test class to test RegionalTransportService
 */
public class RegionalTransportServiceTest {

	@Test
	public void UTC_01_01(){
		// input list 
		List<String> inputList = new ArrayList<String>();
		inputList.add("KA-55");
		inputList.add("KA-01");
		inputList.add("KA-04");
		inputList.add("KA-56");
		inputList.add("KA-50");
		inputList.add("KA-02");
		
		// excepted list after sorting based on Area name
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("KA-56");
		expectedList.add("KA-01");
		expectedList.add("KA-55");
		expectedList.add("KA-02");
		expectedList.add("KA-50");
		expectedList.add("KA-04");
		
		assertEquals(expectedList,RegionalTransportService.sortVehiclesRegisteredBasedOnArea(inputList));
	}
	
	@Test
	public void UTC_01_02(){
		// input list 
		List<String> inputList = new ArrayList<String>();
		inputList.add("KA-57");
		inputList.add("KA-51");
		inputList.add("KA-04");
		inputList.add("KA-02");
		
		// excepted list after sorting based on Area name
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("KA-51");
		expectedList.add("KA-02");
		expectedList.add("KA-57");
		expectedList.add("KA-04");
		
		
		assertEquals(expectedList,RegionalTransportService.sortVehiclesRegisteredBasedOnArea(inputList));
	}
	
	@Test
	public void UTC_01_03(){
		// input list 
		List<String> inputList = new ArrayList<String>();
		inputList.add("KA-57");
		inputList.add("KA-51");
		inputList.add("KA-04");
		inputList.add("KA-02");
		inputList.add("KA-57");
		inputList.add("KA-04");
		
		// excepted list after sorting based on Area name and registration sequence
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("KA-51");
		expectedList.add("KA-02");
		expectedList.add("KA-57");
		expectedList.add("KA-57");
		expectedList.add("KA-04");
		expectedList.add("KA-04");
		
		assertEquals(expectedList,RegionalTransportService.sortVehiclesRegisteredBasedOnArea(inputList));
	}
}   


