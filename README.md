# LMS Hook
* When a user completes a lecture in SPINSOFT.in website, it will trigger a hook
* It will call a rest endpoint

#### API Gateway
```
https://kd0ss19nyf.execute-api.ap-south-1.amazonaws.com/prod/lms_hook
```

#### AWS Lambda
* It will invoke the below method - handleRequest
```java
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
```

* Input JSON
```javascript
{
    "type": "LectureProgress.created",
    "id": 82892710,
    "livemode": true,
    "created": "2018-03-22T12:28:58+00:00",
    "hook_event_id": 47692296,
    "object": {
        "id": 82892710,
        "is_completed": true,
        "course_id": 301405,
        "lecture_id": 4666823,
        "school_id": 206817,
        "percent_complete": 40,
        "course": {
            "id": 301405,
            "name": "Programming Fundamentals",
            "url": "http://spinsoft.in/courses/301405",
            "friendly_url": "programming-fundamentals",
            "meta_description": "Learn the fundamentals of programming.",
            "description": "<p>In this course, you will the learn the fundamentals of Java Programming\n</p>\n<ul>\n<li>Variables</li>\n<li>Datatypes</li>\n<li>Keywords</li>\n<li>Conditional Statements - If/Else</li>\n<li>Looping Statements - for, while, do-while</li>\n<li>Operators - Arithmetic, Comparison, Logical </li>\n<li>Arrays</li>\n\n\n</ul>",
            "author_bio": {
                "created_at": "2018-03-09T05:01:01Z",
                "headline": "Corporate Trainer",
                "profile_image_url": "https://www.filepicker.io/api/file/LxbidRvcRQWe3oOvhE2p",
                "bio": "<p>I'm Naresh having 12+ yrs experience in Development and Training .\n</p>",
                "position": null,
                "user_id": null,
                "name": "Naresh Kumar",
                "id": 142894,
                "meta": {
                    "class": "authorbio",
                    "url": "/author_bios/142894",
                    "name": "Naresh Kumar",
                    "description": "",
                    "image_url": null
                }
            }
        },
        "user": {
            "id": 10228583,
            "role": "student",
            "email": "ikosymus-2632@yopmail.com",
            "name": "Suresh",
            "school_id": 206817,
            "src": null,
            "first_touch": null,
            "last_touch": null,
            "last_sign_in_at": "2018-03-18T08:38:02Z",
            "sign_in_count": 3,
            "unsubscribe_from_marketing_emails": null
        },
        "lecture": {
            "id": 4666823,
            "name": "Get inputs using Scanner",
            "is_published": true
        }
    }
}
```
