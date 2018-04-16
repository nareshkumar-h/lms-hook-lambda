package com.naresh.webhookdemo.model;

public class ActivityEvent {

	private Long id;
	private boolean is_completed;
	private Integer course_id;
	private Integer lecture_id;
	private Integer school_id;
	private Integer percent_complete;
	
	private Course course;	
	private User user;	
	
	@Override
	public String toString() {
		return "ActivityEvent [id=" + id + ", is_completed=" + is_completed + ", course_id=" + course_id
				+ ", lecture_id=" + lecture_id + ", school_id=" + school_id + ", percent_complete=" + percent_complete
				+ ", course=" + course + ", user=" + user + ", lecture=" + lecture + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isIs_completed() {
		return is_completed;
	}
	public void setIs_completed(boolean is_completed) {
		this.is_completed = is_completed;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Integer getLecture_id() {
		return lecture_id;
	}
	public void setLecture_id(Integer lecture_id) {
		this.lecture_id = lecture_id;
	}
	public Integer getSchool_id() {
		return school_id;
	}
	public void setSchool_id(Integer school_id) {
		this.school_id = school_id;
	}
	public Integer getPercent_complete() {
		return percent_complete;
	}
	public void setPercent_complete(Integer percent_complete) {
		this.percent_complete = percent_complete;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Lecture getLecture() {
		return lecture;
	}
	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}
	private Lecture lecture;
	
}
