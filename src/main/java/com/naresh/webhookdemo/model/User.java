package com.naresh.webhookdemo.model;

public class User {

	private Long id;
	private String role;
	private String email;
	private String name;
	private Integer school_id;
	private String src; //null
	private String first_touch; //null
	private String last_touch; //null
	private String last_sign_in_at;
	private int sign_in_count;
	private String unsubscribe_from_marketing_email; //null
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSchool_id() {
		return school_id;
	}
	public void setSchool_id(Integer school_id) {
		this.school_id = school_id;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getFirst_touch() {
		return first_touch;
	}
	public void setFirst_touch(String first_touch) {
		this.first_touch = first_touch;
	}
	public String getLast_touch() {
		return last_touch;
	}
	public void setLast_touch(String last_touch) {
		this.last_touch = last_touch;
	}
	public String getLast_sign_in_at() {
		return last_sign_in_at;
	}
	public void setLast_sign_in_at(String last_sign_in_at) {
		this.last_sign_in_at = last_sign_in_at;
	}
	public int getSign_in_count() {
		return sign_in_count;
	}
	public void setSign_in_count(int sign_in_count) {
		this.sign_in_count = sign_in_count;
	}
	public String getUnsubscribe_from_marketing_email() {
		return unsubscribe_from_marketing_email;
	}
	public void setUnsubscribe_from_marketing_email(String unsubscribe_from_marketing_email) {
		this.unsubscribe_from_marketing_email = unsubscribe_from_marketing_email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", role=" + role + ", email=" + email + ", name=" + name + ", school_id=" + school_id
				+ ", src=" + src + ", first_touch=" + first_touch + ", last_touch=" + last_touch + ", last_sign_in_at="
				+ last_sign_in_at + ", sign_in_count=" + sign_in_count + ", unsubscribe_from_marketing_email="
				+ unsubscribe_from_marketing_email + "]";
	}
	
	
}
