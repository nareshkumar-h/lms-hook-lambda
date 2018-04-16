package com.naresh.webhookdemo;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.naresh.webhookdemo.model.ActivityEvent;
import com.naresh.webhookdemo.model.Course;
import com.naresh.webhookdemo.model.HookEvent;
import com.naresh.webhookdemo.model.Lecture;
import com.naresh.webhookdemo.model.User;
import com.naresh.webhookdemo.util.ConnectionUtil;

public class UserLectureEventDAO {

	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();


	public void saveLectureEvent(HookEvent hookEvent) {

		ActivityEvent object = hookEvent.getObject();
		Course course = object.getCourse();
		Lecture lecture = object.getLecture();
		User user = object.getUser();

		try {
			
			if (!isUserExists(user.getId())) {
				saveUser(user);
			}

			if (!isCourseExists(course.getId())) {
				saveCourse(course);
			}

			if (!isLectureExists(lecture.getId())) {
				saveLecture(course.getId(), lecture);
			}

			if (!isUserLectureExists(user.getId(), lecture.getId())) {
				saveUserLecture(object, course, lecture, user);
			}

			// Update Course completion percentage
			saveOrUpdateCoursePercent(user.getId(), course.getId(), object.getPercent_complete());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void saveUserLecture(ActivityEvent object, Course course, Lecture lecture, User user) {
		String sql = "insert into lms_user_lectures ( user_id, course_id, lecture_id,is_completed,completed_date ) values ( ?, ?, ? ,? ,NOW() )";
		System.out.println(sql);

		Object[] params = { user.getId(), course.getId(), lecture.getId(), object.isIs_completed() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("User Lecture Added:" + rows);
	}
	
	public boolean isUserExists(Long userId) {

		boolean exists = false;
		try {
			String sql = "select 1 from lms_users where id = ?";
			Object[] params = { userId };
			exists = jdbcTemplate.queryForObject(sql, params, Boolean.class);
		} catch (EmptyResultDataAccessException e) {
			// e.printStackTrace();
		}
		return exists;
	}


	public boolean isLectureExists(Long lectureId) {

		boolean exists = false;
		try {
			String sql = "select 1 from lms_lectures where id = ?";
			Object[] params = { lectureId };
			exists = jdbcTemplate.queryForObject(sql, params, Boolean.class);
		} catch (EmptyResultDataAccessException e) {
			// e.printStackTrace();
		}
		return exists;
	}

	public boolean isUserLectureExists(Long userId, Long lectureId) {

		boolean exists = false;
		try {
			String sql = "select 1 from lms_user_lectures where lecture_id = ? and user_id = ?";
			Object[] params = { lectureId, userId };
			exists = jdbcTemplate.queryForObject(sql, params, Boolean.class);
		} catch (EmptyResultDataAccessException e) {
			// e.printStackTrace();
		}
		return exists;
	}

	public void saveOrUpdateCoursePercent(Long userId, Long courseId, Integer percent) {
		String sql = "INSERT INTO lms_user_courses ( user_id,course_id,percent ) VALUES( ?, ?, ? ) ON DUPLICATE KEY UPDATE  percent= ?";
		Object[] params = { userId, courseId, percent, percent };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("Update Course Completion Percentage: " + rows);
	}

	public void saveCourse(Course course) {

		String sql = "insert into lms_courses ( id, name, sub_title, description) values ( ?,?,?,?)";
		Object[] params = { course.getId(), course.getName(), course.getMeta_description(), course.getDescription() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("Course Added:" + rows);
	}
	
	public void saveUser(User user) {

		String sql = "insert into lms_users ( id, role,name, email) values ( ?,?,?,?)";
		Object[] params = { user.getId(), user.getRole(), user.getName(), user.getEmail()};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("User Added:" + rows);
	}

	public void saveLecture(Long courseId, Lecture lecture) {

		String sql = "insert into lms_lectures ( id, course_id, name, is_published) values ( ?,?,?,?)";
		Object[] params = { lecture.getId(), courseId, lecture.getName(), lecture.isIs_published() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("Lecture Added:" + rows);
	}

	public boolean isCourseExists(Long courseId) {

		boolean exists = false;
		try {
			String sql = "select 1 from lms_courses where id = ?";
			Object[] params = { courseId };
			exists = jdbcTemplate.queryForObject(sql, params, Boolean.class);
		} catch (EmptyResultDataAccessException e) {

		}
		return exists;
	}
}
