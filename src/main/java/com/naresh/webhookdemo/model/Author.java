package com.naresh.webhookdemo.model;

import java.time.LocalDateTime;

public class Author {
	
	private String created_at;
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	private String headline;
	private String profile_image_url;
	private String bio;
	private Integer position;
	private Integer user_id;
	
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getProfile_image_url() {
		return profile_image_url;
	}
	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	private String name;
	private Long id;
	private Meta meta;
	@Override
	public String toString() {
		return "Author [created_at=" + created_at + ", headline=" + headline + ", profile_image_url="
				+ profile_image_url + ", bio=" + bio + ", position=" + position + ", user_id=" + user_id + ", name="
				+ name + ", id=" + id + ", meta=" + meta + "]";
	}

	
}

class Meta
{
	private String classs;
	private String url;
	private String name;
	private String description;
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	private String image_url;
	@Override
	public String toString() {
		return "Meta [classs=" + classs + ", url=" + url + ", name=" + name + ", description=" + description
				+ ", image_url=" + image_url + "]";
	}
	
}
