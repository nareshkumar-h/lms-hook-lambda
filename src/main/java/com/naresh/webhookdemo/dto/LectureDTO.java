package com.naresh.webhookdemo.dto;

public class LectureDTO {
	
	private Integer userId;
	private String email;
	private Integer lectureId;
	private String  lectureName;
	private Integer percentCompleted;
	private Boolean completed;
	private Integer courseId;
	private String courseName;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getLectureId() {
		return lectureId;
	}
	public void setLectureId(Integer lectureId) {
		this.lectureId = lectureId;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public Integer getPercentCompleted() {
		return percentCompleted;
	}
	public void setPercentCompleted(Integer percentCompleted) {
		this.percentCompleted = percentCompleted;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

}
