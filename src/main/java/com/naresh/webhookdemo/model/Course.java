package com.naresh.webhookdemo.model;

public class Course {

	private Long id;
	private String name;
	private String url;
	private String friendly_url;
	private String meta_description;
	private String description;
	
	private Author author_bio;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFriendly_url() {
		return friendly_url;
	}

	public void setFriendly_url(String friendly_url) {
		this.friendly_url = friendly_url;
	}

	public String getMeta_description() {
		return meta_description;
	}

	public void setMeta_description(String meta_description) {
		this.meta_description = meta_description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", url=" + url + ", friendly_url=" + friendly_url
				+ ", meta_description=" + meta_description + ", description=" + description + ", author_bio="
				+ author_bio + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor_bio() {
		return author_bio;
	}

	public void setAuthor_bio(Author author_bio) {
		this.author_bio = author_bio;
	}
	
}
