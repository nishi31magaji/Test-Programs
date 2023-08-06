package com.yodlee.test;


public class Node {
	int val;
	Node next;
	static Node head;
	Node tail;

	Node() {

	}

	Node(int val) {
		this.val = val;
	}

	public void addNode(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public static void displayNodes() {
		/*
		 * Node current = head; if (head == null) { System.out.println("empty list"); }
		 * else { while (current != null) { System.out.println(current.val); current =
		 * current.next; } }
		 */
		
		while(head!=null) {
			System.out.println("displayNodes:"+head.val);
			head=head.next;
		}
	}

	public static Node mergeTwoLists(Node list1, Node list2) {
		Node result = null;
		Node head = null;

		while (list1 != null || list2 != null) { // as any list can be smaller
			int minVal;
			if (list1 == null) {
				minVal = list2.val;
				list2 = list2.next;
			} else if (list2 == null) {
				minVal = list1.val;
				list1 = list1.next;
			} else if (list1.val <= list2.val) {
				minVal = list1.val;
				list1 = list1.next;
			} else {
				minVal = list2.val;
				list2 = list2.next;

			}
			if (result == null) {
				result = head= new Node(minVal);
			} else {
				result.next = new Node(minVal);
				result = result.next;
			}
		}
		return head;
	}
	
	 static void printLinkedList(Node head) {
	        while(head != null) {
	            System.out.print(head.val+" ");
	            head = head.next;
	        }
	    }
	 
	private Node removeLastNode(Node n1) {
		Node current = n1;
		if(n1==null && n1.next==null) {
			return null;
		}
	
		while(current.next.next!=null) {
			current=current.next;
			System.out.println(current.val);

		}
		current.next=null;
		return n1;
	}

	public static void main(String[] args) {
		/*
		 * Node list1 = new Node();
		 * 
		 * list1.addNode(1); list1.addNode(2); list1.addNode(3); list1.addNode(4); //
		 * list1.displayNodes();
		 * 
		 * Node list2 = new Node();
		 * 
		 * list2.addNode(2); list2.addNode(4); list2.addNode(5);
		 */
		
		Node list1 = new Node(1);
		list1.next = new Node(2);
		list1.next.next = new Node(4);

	    Node list2 = new Node(1);
	    list2.next = new Node(3);
	    list2.next.next = new Node(4);


		Node mergedList = mergeTwoLists(list1,list2);
	    while(mergedList != null) {
	      System.out.print(mergedList.val + " ");
	      mergedList = mergedList.next;
	    }
	    System.out.println("-------------------------------------");
	    Node n1 = new Node(23);
        Node n2 = new Node(29);
       /* Node n3 = new Node(29);
        Node n4 = new Node(45);
        Node n5 = new Node(45);
        Node n6 = new Node(45);
        Node n7 = new Node(54);*/
        n1.next = n2;
       /* n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;*/
        Node r = new Node();
      //  r.displayNodes();
 	    n1 = r.removeLastNode(n1);
 	    System.out.println(n1.val);
 	   printLinkedList(n1);
	}

}
