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
	 * 처음에 추가
	 * @param data
	 */
	public void addFirst(Object data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
		size++;
		
		if(head.next == null){//head 노드만 있을경우
			tail = head;
		}
	}
	
	/**
	 * 중간에 추가
	 * @param idx 삽입할 위치 index
	 * @param data 삽입할 데이터
	 */
	public void addMiddle(int idx, Object data){
		Node newNode = new Node(data);
		Node temp1 = head;//삽입할 노드의 이전 노드
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
