package com.wesleyreisz.louisville.android.class1.homework1;

public class Node {
	private Node node;
	private String value;
	public Node(String value){
		this.value = value;
	}
	@Override
	public String toString(){
		return value + " ";
	}
	public void setNode(Node node){
		this.node = node;
	}
	public Node getNode(){
		return this.node;
	}
}
