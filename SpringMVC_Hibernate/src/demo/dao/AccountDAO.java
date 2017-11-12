package demo.dao;

import java.util.List;

import demo.entities.Account;

public interface AccountDAO {
	
	public List<Account> findAll();
	
}
