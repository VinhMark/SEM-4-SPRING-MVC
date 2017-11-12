package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("demo")
public class DemoController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("a", "123456");
		modelMap.put("username", "abc");
		return "demo/index";
	}
	
	@RequestMapping(value="demo2" ,method =RequestMethod.GET)
	public String demo2() {
		return "demo/demo2";
	}
	@RequestMapping(value="demo3/{id}" ,method =RequestMethod.GET)
	public String demo3(@PathVariable("id") int id , ModelMap modelMap) {//tham số truyền qua đường dẫn
		modelMap.put("id", id);
		return "demo/demo3";
	}
}
