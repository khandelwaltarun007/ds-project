package com.ds.linklist;

public class LinkList1 {

	SingleNode start;
	SingleNode end;
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void createAtBeginning(int data) {
		SingleNode node = new SingleNode(data, null);
		size++;
		if (start == null) {
			start = node;
			end = start;
		} else {
			node.setLink(start);
			start = node;
		}
	}

	public void createAtEnd(int data) {
		SingleNode node = new SingleNode(data, null);
		size++;
		if (start == null) {
			start = node;
			end = start;
		} else {
			end.setLink(node);
			end = node;

		}
	}

	public void createAtPosition(int data, int pos) {
		SingleNode node = new SingleNode(data, null);
		pos = pos - 1;
		SingleNode ptr = start;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				SingleNode temp = ptr.getLink();
				ptr.setLink(node);
				node.setLink(temp);
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	public static void main(String[] args) {

	}
}
