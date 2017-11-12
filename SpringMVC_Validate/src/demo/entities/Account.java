package demo.entities;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import demo.validate.Group1;

public class Account {
	
	private String username;

	private String password;
	
	private String email;
	
	private int age;
	
	private String website;
	
	
	@URL(groups={Group1.class})
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@NotEmpty(groups={Group1.class})
	@Email(groups={Group1.class})
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Min(value=18,groups={Group1.class})
	@Max(value=50,groups={Group1.class})
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@NotEmpty(groups={Group1.class})
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",groups={Group1.class})
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotEmpty(groups={Group1.class})
	@Length(min = 3 ,max = 10,groups={Group1.class})
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
