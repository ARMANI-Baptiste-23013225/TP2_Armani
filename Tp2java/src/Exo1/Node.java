package Exo1;

import java.util.LinkedList;

public class Node {
	private int element;
	private Node next;
	
	public Node(int Liste, Node noeud) {
		element = Liste;
		next = noeud;
	}
	
	public int getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setElement(int newElem) {
		element = newElem;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}
	
	public static void main(String[] args) {
		SLinkedList liste = new SLinkedList();
		liste.addFirst(51);
		liste.addEnd(0);
		liste.printList();
	}
	
}


