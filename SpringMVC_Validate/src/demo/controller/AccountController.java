package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.entities.*;
import demo.validate.*;

@Controller
@RequestMapping("account")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/index";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("account") @Validated({ Group1.class }) Account account,
			BindingResult bindingResult, ModelMap modelMap) {
		AccountValidator accountValidator = new AccountValidator();
		accountValidator.validate(account, bindingResult);
		if (bindingResult.hasErrors()) {// nếu có lỗi sảy ra
			return "account/index";
		} else {
			modelMap.put("account", account);
			return "account/success";
		}

	}

}
