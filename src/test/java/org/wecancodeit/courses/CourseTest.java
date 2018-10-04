package org.wecancodeit.courses;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CourseTest {
	@Test
	public void shouldGetCorrectId() {
		Course underTest = new Course("spring", "Spring Framework", "Spring Framework lorem ipsum blah blah");
		String result = underTest.getId();
		assertThat(result, is(equalTo("spring")));
	}
}
