package com.exam.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.exam.dao.adminUserDao;
import com.exam.pojo.Adminuser;
@Component
public class adminUserDaoImpl implements adminUserDao {
	@Resource
	private SessionFactory sessionFactory;

	@Override 
	public void AddUser(Adminuser adminuser) {
		String hql = "insert into adminuser (id,name,password)values(?,?,?)";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0,adminuser.getId() );
		query.setParameter(1, adminuser.getName());
		query.setParameter(2, adminuser.getPassword());
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(Adminuser adminuser) {
		String hql = "update adminuser set name=? password=? where id=?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0,adminuser.getName());
		query.setParameter(1,adminuser.getPassword());
		query.setParameter(2,adminuser.getId());
		
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Adminuser adminuser) {
		String hql ="delect from adminuser where id=?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, adminuser.getId());
		// TODO Auto-generated method stub

	}

}
