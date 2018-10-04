package org.wecancodeit.courses;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CourseController {
	
	private CourseRepository courseRepo = new CourseRepository();
	
	@GetMapping("/courses")
	public String courses(Model model) {
		model.addAttribute("courses", courseRepo.getAllCourses());
        return "courses";
    }
	
    @GetMapping("/courses/{id}")
    public String course(@PathVariable(value = "id") String id, Model model) {
    	model.addAttribute("course", courseRepo.getCourse(id));
        return "course";
    }

}