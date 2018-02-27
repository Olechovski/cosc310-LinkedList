package edu.iup.cosc310.util;


/**
 * This class is used to implement the methods from
 * the ItemList interface.
 * 
 * LinkedItemList is implemented as a doubly linked circular list that uses a 'dummy' node or a start note to reference
 * the head and tail of the list.
 * 
 * 
 * @author Eric Olechovski
 *
 * @param <E>
 */
public class LinkedItemList<E> implements ItemList<E> {
	

	private int noItems = 0;
	private Node dummy = new Node (null, null, null);

	
	public LinkedItemList() {
		super();
		dummy.next = dummy;
		dummy.prev = dummy;
	}

	/**
	 * This class is used to create a circular
	 * double linked list for the Item List
	 * 
	 * @author Eric Olechovski
	 *
	 */
	public class Node {
		private E data;
		private Node next;
		private Node prev;
		
		
		public Node(LinkedItemList<E>.Node prev, E data, LinkedItemList<E>.Node next) {
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
			
		}
	}
	


	@Override
	public void append(E item) {
		appendAfter(item,dummy.prev);
	}

	@Override
	public void insert(E item, int index) throws IllegalArgumentException {
		// subtract 1 off index so that it will insert at the index rather than after
		appendAfter(item, getNode(index-1));
	}
	
	
	/**
	 * Responsible for creating a node and appending it to the list
	 * used for insert and append method
	 * 
	 * @param item
	 * @param node
	 * 
	 */
	private void appendAfter(E item, Node node){
		node.next =  new Node(node, item, node.next);
		dummy.prev = node.next;
		noItems++;
	}

	@Override
	public E get(int index) {
		if (index < 0){
			throw new IndexOutOfBoundsException ();
		}
		Node ptr = getNode(index);
		return ptr.data;
	}

	
	@Override
	public E remove(int index){
		Node remove = getNode(index);
		remove.prev.next = remove.next;
		remove.next.prev = remove.prev;
		noItems--;
		return remove.data;

	}

	/**
	 * Returns the node at a given index from the list
	 * 
	 * @param index
	 * @return Node
	 */
	public Node getNode(int index){
	
		if ( index >= noItems || index < -1){
			throw new IndexOutOfBoundsException();
		}
		
		Node ptr = dummy;
		while (index > -1){
			ptr = ptr.next;
			index--;
		}
		return ptr;
	}
	
	public boolean isEmpty(){
		return noItems == 0;
	}
	
	public void clear(){
		dummy.next = dummy;
		dummy.prev = dummy;
		noItems = 0;
	}
	
	public int size(){
		return noItems;
		
	}

}