package Com.DsAndAl;

public class Node<K> {
	public K data;
	public Node<K> next;
	public Node<K> previous;

	public Node() {
		this.next = null;
		this.previous = null;
	}

	public Node(K data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}
}
