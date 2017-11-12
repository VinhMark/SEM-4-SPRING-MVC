package demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.dao.AccountDAO;
import demo.entities.Account;

@Service("accountServices")
@Transactional
public class AccountServicesImpl implements AccountServices{

	@Autowired
	private AccountDAO accountDAO;
	
	@Override
	public List<Account> findAll() {
		return accountDAO.findAll();
	}

}
