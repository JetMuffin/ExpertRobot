package com.robot.db.dao.impl;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 封装的dao基类,所有dao的实现类都应继承该类
 * @author sloriac
 *
 */
public class BaseDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * 获取当前线程的session
	 * @return session对象
	 */
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	/**
	 * 保存操作
	 * @param object 需要保存的对象
	 */
	public void save(Object object){
		getSession().save(object);
	}
	
	/**
	 * 更新操作
	 * @param object 更新对象
	 */
	public void update(Object object){
		getSession().update(object);
	}
	
	/**
	 * 保存或者更新
	 * @param object 操作对象
	 */
	public void saveOrUpdate(Object object){
		getSession().saveOrUpdate(object);
	}
	
	public Object get(Class arg0, Serializable arg1){
		return getSession().get(arg0, arg1);
	}
	
	public Query query(String hql){
		return getSession().createQuery(hql);
	}
}
