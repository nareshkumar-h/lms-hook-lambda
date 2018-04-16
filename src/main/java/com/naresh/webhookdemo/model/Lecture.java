package com.naresh.webhookdemo.model;

public class Lecture {

	private Long id;
	private String name;
	private boolean is_published;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIs_published() {
		return is_published;
	}
	public void setIs_published(boolean is_published) {
		this.is_published = is_published;
	}
	@Override
	public String toString() {
		return "Lecture [id=" + id + ", name=" + name + ", is_published=" + is_published + "]";
	}
	 
}
