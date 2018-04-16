package com.naresh.webhookdemo.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.naresh.webhookdemo.UserLectureEventDAO;
import com.naresh.webhookdemo.model.HookEvent;

public class CourseEventController implements RequestHandler<HookEvent, String> {

	private UserLectureEventDAO lectureEventDAO = new UserLectureEventDAO();

	public String handleRequest(HookEvent event, Context context) {
		String message = "success";
		try {
			lectureEventDAO.saveLectureEvent(event);
		} catch (Exception e) {
			message = e.getMessage();
		}
		return message;
	}

}
