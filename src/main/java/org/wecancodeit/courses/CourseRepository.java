package org.wecancodeit.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CourseRepository {

	Map<String, Course> courses = new HashMap<>();

	public CourseRepository() {
		courses.put("spring", new Course("spring", "Spring Framework", "[insert description here]"));
		courses.put("java", new Course("java", "Core Java", "[insert description here]"));
		courses.put("javascript", new Course("javascript", "Intro to Javascript", "[insert description here]"));
	}

	public Collection<Course> getAllCourses() {
		return courses.values();
	}

	public Course getCourse(String id) {
		return courses.get(id);
	}

}
