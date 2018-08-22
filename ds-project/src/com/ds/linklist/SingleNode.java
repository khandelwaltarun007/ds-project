package com.ds.linklist;

public class SingleNode {
	protected int data;
	protected SingleNode link;

	public SingleNode() {
		data = 0;
		link = null;
	}

	public SingleNode(int data, SingleNode link) {
		super();
		this.data = data;
		this.link = link;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SingleNode getLink() {
		return link;
	}

	public void setLink(SingleNode link) {
		this.link = link;
	}

}
