package com.deppon.test05.entity;

public class PersonEntity implements java.io.Serializable {
	private static final long serialVersionUID = -1138245964662330288L;

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + "]";
	}

}