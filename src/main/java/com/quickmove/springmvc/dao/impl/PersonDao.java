package com.quickmove.springmvc.dao.impl;

import com.quickmove.springmvc.dao.IPersonDao;

public class PersonDao implements IPersonDao {

	@Override
	public void save() {
		System.out.println("------------from PersonDao.save()");
	}

}