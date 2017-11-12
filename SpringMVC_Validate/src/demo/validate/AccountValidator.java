package demo.validate;

import org.springframework.validation.*;
import demo.entities.*;

public class AccountValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Account.class.equals(arg0);
	}

	@Override
	public void validate(Object object, Errors errors) {
		///..............
		Account account =(Account)object;
		if(account.getUsername().equalsIgnoreCase("abc")){
			errors.rejectValue("username","account.username.exists");
		}
		
	}
	

}
