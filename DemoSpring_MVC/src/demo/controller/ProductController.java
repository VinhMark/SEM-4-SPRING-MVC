package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.model.ProductModel;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		
		ProductModel model = new ProductModel();
		modelMap.put("product", model.find());
		
		return "product/index";
	}
	
	@RequestMapping(value="list",method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		ProductModel model = new ProductModel();
		modelMap.put("products", model.findAll());
		return "product/list";
	}
	
}
