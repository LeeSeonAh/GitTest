package DataStructure;

public class LinkedList {
	//head, tail, size
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{
		
		//data+link
		private Object data;
		private Node next;
		
		public Node(Object data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
	}

	/**
	 * ó���� �߰�
	 * @param data
	 */
	public void addFirst(Object data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
		size++;
		
		if(head.next == null){//head ��常 �������
			tail = head;
		}
	}
	
	/**
	 * �߰��� �߰�
	 * @param idx ������ ��ġ index
	 * @param data ������ ������
	 */
	public void addMiddle(int idx, Object data){
		Node newNode = new Node(data);
		Node temp1 = head;//������ ����� ���� ���
		Node temp2 = temp1.next;
		while(--idx != 0){
			temp1 = temp1.next;
		}
		
		temp1.next = newNode;
		newNode.next = temp2;
		
		size++;
		
		if(newNode.next == null){
			tail = newNode;
		}
		
	}

}
