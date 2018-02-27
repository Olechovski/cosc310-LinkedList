package edu.iup.cosc310.util;

/**
 * This class is intended to test the implemented interface methods
 * in LinkedItemList.java
 * 
 * Basic Test 
 * 
 * @author Eric Olechovski
 *
 */
public class TestLinkedItemList {

	public static void main(String[] args) {
		
		ItemList<String> list = new LinkedItemList<String>();
	
		// makes sure that the list is empty because no items have been added.
		assert list.size() == 0 : "Expect empty list to have 0 items, got " + list.size();
		
		list.append("one");
		
		// insures that append and get methods work properly
		assert "one".equals(list.get(0)) : "Expect get(0) to be \"one\", got " + list.get(0);
		
		
		list.append("two");
		list.append("three");
		list.append("four");
		
	
		// insures that number of items are kept track of after adding them
		assert list.size() == 4 : "Expect list to have 4 items, got " + list.size();
		
		list.insert("insert", 2);
		// insures that item was inserted without overwriting other items.
		assert "insert".equals(list.get(2)) : "Expect get(2) to be \"insert\", got " + list.get(2);

		// insures that number of items are kept track of after inserting them
		assert list.size() == 5 : "Expect list to have 5 items, got " + list.size();
		
		list.remove(2);
		// insures that removeItem method works by removing what was inserted
		assert "three".equals(list.get(2)) : "Expect get(2) to be \"three\", got " + list.get(2);
		
		// insures that number of items are kept track of after removing an item
		assert list.size() == 4 : "Expect list to have 4 items, got " + list.size();
		
	
		assert false : "Test Complete - No Errors";
		
		System.out.println("Assertions Disabled");
		System.out.println("\nTo enable assertions: \n1. Run Configurations => Arguments => type '-ea' in the VM arguments");
		
	}

}