package com.ds.linklist;

public class LinkList {

	SingleNode start;
	SingleNode end;
	int size;

	public LinkList() {
		start = null;
		end = null;
		size = 0;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void createAtStart(int data) {
		SingleNode newNode = new SingleNode(data, null);
		size++;
		if (start == null) {
			start = newNode;
			end = start;
		} else {
			newNode.setLink(start);
			start = newNode;
		}
	}

	public void createAtEnd(int data) {
		SingleNode newNode = new SingleNode(data, null);
		size++;
		if (start == null) {
			start = newNode;
			end = start;
		} else {
			end.setLink(newNode);
			end = newNode;
		}
	}

	public void display() {
		if (size == 0) {
			System.out.println("LinkList is empty");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		SingleNode ptr = start;
		System.out.print(ptr.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.createAtStart(1);
		linkList.createAtEnd(2);
		linkList.createAtEnd(3);
		linkList.createAtEnd(4);
		linkList.createAtEnd(5);
		linkList.createAtEnd(6);
		linkList.display();

	}

}
