package pl.techstyle.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.techstyle.Model.Person;

@Controller
public class MianController {

		@GetMapping("/")
		public ModelAndView getIndex() {
			ModelAndView m= new ModelAndView();
			m.addObject("person",new Person());
			m.setViewName("index");
			return m;
		}
		
		@PostMapping("/postAction")
		public ModelAndView getPost(@Valid Person person,BindingResult result) {
			ModelAndView m= new ModelAndView();
			System.out.println(person.toString());
			m.addObject("person",person);
			m.setViewName("hello");
			return m;
		}
}
