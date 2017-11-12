package demo.model;

import java.util.ArrayList;
import java.util.List;

import demo.entities.Language;
import demo.entities.Product;
import demo.entities.Role;

public class RoleModel {
	public List<Role> findAll() {
		List<Role> roles = new ArrayList<Role>();
		roles.add(new Role("l1" , "LANGUAGE1" ));
		roles.add(new Role("l2" , "LANGUAGE2" ));
		roles.add(new Role("l3" , "LANGUAGES" ));
		roles.add(new Role("l4" , "LANGUAGE4" ));
		return roles;
	}
}
