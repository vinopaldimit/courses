package org.wecancodeit.courses;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class CourseRepositoryTest {
	@Test
	public void shouldGetCollection() {
		CourseRepository underTest = new CourseRepository();
		Collection<Course> result = underTest.getAllCourses();
		assertThat(result,
				containsInAnyOrder(new Course("spring", "Spring Framework", "[insert description here]"),
						new Course("java", "Core Java", "[insert description here]"),
						new Course("javascript", "Intro to Javascript", "[insert description here]")));
	}

	@Test
	public void shouldGetParticularCourse() {
		CourseRepository underTest = new CourseRepository();
		Course result = underTest.getCourse("spring");
		assertThat(result, is(equalTo(new Course("spring", "Spring Framework", "[insert description here]"))));
	}
}
