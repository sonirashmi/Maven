package com.repo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserLogin;

@Repository
public class LoginRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public String checkLoginRepo(UserLogin user) {
		System.out.println("Inside Repo" + "\t" + user.getMailId());
		List<UserLogin> ulist=hibernateTemplate.find("from UserLogin where mailId=? and pass=?",user.getMailId(),user.getPass());
		Iterator<UserLogin> itr=ulist.iterator();
			user=itr.next();
			System.out.println(user.getMailId());
		
		return "Saved";
	}
	// ===============================================================
	public UserLogin validateUserRepo(UserLogin usr) {
		System.out.println("Repository:\n\t" + usr.getMailId() + "\t" + usr.getPass());
		return usr;
	}
	/*public boolean checkValidUser(UserLogin user) {
		
	}*/
}
