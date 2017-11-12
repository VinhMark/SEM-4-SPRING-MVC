package demo.dao;


import java.util.List;


import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.entities.Account;

@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Account> findAll() {
		List<Account> accounts = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
		
			transaction =session.beginTransaction();
			
			accounts =session.createQuery("from Account").list();
			
			transaction.commit();
			
		} catch (Exception e) {
			accounts = null;
			if(transaction!=null){
				transaction.rollback();
			}
		}finally {
			session.close();
		}
		return accounts;
	}

}
