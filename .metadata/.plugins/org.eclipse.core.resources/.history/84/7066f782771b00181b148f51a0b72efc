package edu.iup.cosc310.util;

/**
 * This class is intended to test the implemented interface methods
 * in LinkedItemList.java
 * 
 * @author Eric Olechovski
 *
 */
public class TestLinkedItemList {

	public static void main(String[] args) {
		
		ItemList<String> list = new LinkedItemList<String>();
	
		// makes sure that the list is empty because no items have been added.
		assert list.getNoItems() == 0 : "Expect empty list to have 0 items, got " + list.getNoItems();
		
		list.addItem("one");
		
		// insures that addItem and getItem methods work properly
		assert "one".equals(list.getItem(0)) : "Expect getItem(0) to be \"one\", got " + list.getItem(0);
		
		
		list.addItem("two");
		list.addItem("three");
		list.addItem("four");
		
	
		// insures that number of items are kept track of after adding them
		assert list.getNoItems() == 4 : "Expect list to have 4 items, got " + list.getNoItems();
		
		list.insertItem("insert", 2);
		// insures that item was inserted without overwriting other items.
		assert "insert".equals(list.getItem(2)) : "Expect getItem(2) to be \"insert\", got " + list.getItem(2);

		// insures that number of items are kept track of after inserting them
		assert list.getNoItems() == 5 : "Expect list to have 5 items, got " + list.getNoItems();
		
		list.removeItem(2);
		// insures that removeItem method works by removing what was inserted
		assert "three".equals(list.getItem(2)) : "Expect getItem(2) to be \"three\", got " + list.getItem(2);
		
		// insures that number of items are kept track of after removing an item
		assert list.getNoItems() == 4 : "Expect list to have 4 items, got " + list.getNoItems();
		
	
		assert false : "Test Complete - No Errors";
		
		System.out.println("Assertions Disabled");
		System.out.println("\nTo enable assertions: \n1. Run Configurations => Arguments => type '-ea' in the VM arguments");
		
	}

}