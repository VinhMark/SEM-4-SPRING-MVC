package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("special")
public class SpecialController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "special.index";
		
	}
}
