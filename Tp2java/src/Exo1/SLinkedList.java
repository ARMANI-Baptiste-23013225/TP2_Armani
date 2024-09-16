package Exo1;

public class SLinkedList {
    private Node head; 
    private int size;
    private Node noeud3;

    public SLinkedList() {
        head = null;
        size = 0;
    }

    
    public void addFirst(int element) {
        head = new Node(element, head);
        --size;
    }
    
    public void addEnd(int element) {
    	head = new Node(element, head);
    	++size;
    }
    
    public void echange(Node noeud1, Node noeud2) {
    	noeud3 = noeud1;
    	noeud1 = noeud2;
    	noeud2 = noeud3;
    }

   
    public void printList(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.print(currentNode.getElement() + " ");
        printList(currentNode.getNext());
    }

    public void printList() {
        printList(head);
    }

    
    public boolean updateElement(int AncienneVal, int NouvelleVal) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement() == AncienneVal) {
                currentNode.setElement(NouvelleVal);
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public Node findSecondToLast() {
        if (head == null || head.getNext() == null) {

            return null;
        }
        else {
        	return head;
        }
    }
    
    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("La liste est vide.");
        }
        int removedElement = head.getElement();
        head = head.getNext();
        size--;
        return removedElement;
    }

    // Obtenir la taille de la liste
    public int getSize() {
        return size;
    }
}