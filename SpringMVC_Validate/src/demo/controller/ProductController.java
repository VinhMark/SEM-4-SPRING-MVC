package demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@RequestMapping(method= RequestMethod.GET)
	public String index() {
		return "product/index";
	}
	
	@RequestMapping(value ="search",method= RequestMethod.POST)
	public String search(HttpServletRequest request ,HttpSession session, ModelMap modelMap) {
		String key =request.getParameter("keyword");
		modelMap.put("key", key);
		session.setAttribute("username", "abcdef");
		return "product/index";
	}
	
}
