package Com.DsAndAl;

public class Queue<K> {
	Node<K> front;
	Node<K> rear;
	int size = 0;

	public void addRear(K character) {
		if (front == null) // if no element in list
		{
			Node<K> tNode = new Node<K>(character);
			front = tNode;
			rear = front;
		} else {
			Node<K> tNode = new Node<>(character);
			rear.next = tNode;
			tNode.previous = rear;
			rear = tNode;
		}
		size++;
	}

	public K removeFront() {
		K val = front.data;
		front = front.next;
		size--;
		return val;
	}

	public K removeRear() {
		K val = rear.data;
		rear = rear.previous;
		rear.next = null;
		size--;
		return val;
	}

	public int size() {
		return size;
	}
}
