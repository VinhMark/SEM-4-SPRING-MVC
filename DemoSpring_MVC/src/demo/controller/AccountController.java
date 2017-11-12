package demo.controller;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import demo.entities.Account;
import demo.model.LanguageModel;
import demo.model.RoleModel;

@Controller
@RequestMapping("account")
public class AccountController implements ServletContextAware{
	
	private ServletContext servletContext;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		LanguageModel languageModel = new LanguageModel();
		RoleModel roleModel = new RoleModel();
		Account account = new Account();
		account.setDescription("good boy");
		account.setStatus(true);
		account.setGender("male");
		account.setLanguages(new String[]{"l1" ,"l3"});
		
		modelMap.put("account", account);

		modelMap.put("roles", roleModel.findAll());
		modelMap.put("languages", languageModel.findAll());
		return "account/index";
	}
	
	@RequestMapping(value="save", method = RequestMethod.POST)
	public String save(@ModelAttribute("account") Account account , ModelMap modelMap,@RequestParam(value="image",required=false) MultipartFile photo) {//chỉ ra map vào đối tượng account
		
		account.setPhoto(saveFile(photo));
		
		modelMap.put("account", account);
		
		return "account/success";
	}

	
	//upload images
	private String saveFile(MultipartFile image){
		try {
			System.out.println(servletContext.getRealPath("/")+"assets/image/" + image.getOriginalFilename());
			File file = new File(servletContext.getRealPath("/")+"assets/image/" + image.getOriginalFilename());
			FileUtils.writeByteArrayToFile(file, image.getBytes());
			return image.getOriginalFilename();
		} catch (Exception e) {
			
			return null;
		}
	}
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		
		this.servletContext = servletContext;
		
	}
}
