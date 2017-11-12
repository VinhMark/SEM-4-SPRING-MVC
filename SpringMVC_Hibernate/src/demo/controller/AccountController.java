package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.services.AccountServices;

@Controller
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountServices accountServices;
	
	@RequestMapping(method= RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("accounts", accountServices.findAll());
		return "account/index";
	}
	
}
