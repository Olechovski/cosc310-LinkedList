package edu.iup.cosc310.util;

/**
 * @author Eric Olechovski
 *
 *	This interface is used to create methods
 *	that will add, insert, or remove items
 *	into a list.
 *
 * @param <E>
 */
public interface ItemList<E> {
	
	
	/**
	 * Append an item to the end of the list
	 * @param item - item to be appended
	 */
	public void append(E item);
	
	
	
	/**
	 * Insert an item at a specified index position
	 * 
	 * @param item - item to be inserted
	 * @param index - index position where to insert the item
	 */
	public void insert(E item, int index);
	
	
	/**
	 * Return an item at a specified index
	 * 
	 * @param index - index of the item to return
	 * @return the item at the specified index
	 */
	public E get(int index);
	
	
	/**
	 * Remove an item at a specified index
	 * 
	 * @param index - index of the item to be removed
	 * @return the removed item
	 */
	public E remove(int index);
	
	/**
	 * Return the number of items currently in the list
	 * 
	 * @return the number of items in the list
	 */
	public int size();
	
	/**
	 * Will clear the list
	 */
	public void clear();
	
	/**
	 * Check to see if the list is empty
	 * 
	 * @return true if list is empty
	 */
	public boolean isEmpty();
	
}
