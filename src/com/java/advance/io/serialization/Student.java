package com.java.advance.io.serialization;

import java.io.Serializable;

public class Student implements Serializable {// MarkerInterface

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	transient private int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
